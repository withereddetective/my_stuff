from fractions import Fraction

def determinant(matrix):
    size = len(matrix)
    # Check if matrix is square
    if any(len(row) != size for row in matrix):
        raise ValueError("Matrix must be square to compute its determinant.")

    A = [[Fraction(val) for val in row] for row in matrix]
    det = Fraction(1)
    for i in range(size):
        # Find pivot
        pivot = None
        for j in range(i, size):
            if A[j][i] != 0:
                pivot = j
                break
        if pivot is None:
            return Fraction(0)  # Singular matrix

        if pivot != i:
            A[i], A[pivot] = A[pivot], A[i]
            det *= -1  # Row swap changes sign of determinant

        pivot_val = A[i][i]
        det *= pivot_val
        A[i] = [val / pivot_val for val in A[i]]

        for j in range(i + 1, size):
            factor = A[j][i]
            A[j] = [A[j][k] - factor * A[i][k] for k in range(size)]

    return det

def get_user_matrix():
    print("Enter the size of the square matrix:")
    size = int(input())

    matrix = []
    print("Enter each row with space-separated values (e.g., 1 2 3):")
    for i in range(size):
        while True:
            try:
                row = input(f"Row {i+1}: ").strip().split()
                if len(row) != size:
                    raise ValueError("Incorrect number of columns.")
                matrix.append([Fraction(val) for val in row])
                break
            except Exception as e:
                print(f"Invalid input: {e}. Please try again.")
    return matrix

# Main execution
user_matrix = get_user_matrix()
try:
    det = determinant(user_matrix)
    print(f"\nDeterminant of the matrix: {det}")
except ValueError as e:
    print(f"Error: {e}")
