import sys

class Matrix:
    def __init__(self, rows: int, columns: int):
        self.matrix = []
        self.rows = rows
        self.columns = columns
        for i in range(rows):
            self.matrix.append([])
    
    def fillMatrix(self, lines: list):
        for i, line in enumerate(lines):
            values = [int(x) for x in line.split()]
            self.matrix[i] = values

def multiplyMatrix(matrix1: Matrix, matrix2: Matrix) -> Matrix | None:
    if matrix1.columns != matrix2.rows:
        return None
    
    newMatrix = Matrix(matrix1.rows, matrix2.columns)
    for i in range(matrix1.rows):
        for j in range(matrix2.columns):
            x = 0
            for k in range(matrix1.columns):
                x += matrix1.matrix[i][k] * matrix2.matrix[k][j]
            newMatrix.matrix[i].append(x)
    return newMatrix
                
def main():
    cases = int(sys.stdin.readline().rstrip())

    for i in range(cases):
        line = sys.stdin.readline().rstrip()
        line = line.split()
        matrix1 = Matrix(int(line[0]), int(line[1]))
        matrix2 = Matrix(int(line[2]), int(line[3]))

        lines = []
        for i in range(matrix1.rows):
            lines.append(sys.stdin.readline().rstrip())
        matrix1.fillMatrix(lines)

        lines = []
        for i in range(matrix2.rows):
            lines.append(sys.stdin.readline().rstrip())
        matrix2.fillMatrix(lines)

        newMatrix = multiplyMatrix(matrix1, matrix2)
        if newMatrix is None:
            print("undefined")
        else:
            for i in range(newMatrix.rows):
                for j in range(newMatrix.columns):
                    print(newMatrix.matrix[i][j], end=" ")
                print("")

if __name__ == "__main__":
    main()