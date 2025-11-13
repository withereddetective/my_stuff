from fractions import Fraction

def rref_fraction(matrix):
    A = [[Fraction(val) for val in row] for row in matrix]
    rows, cols = len(A), len(A[0])
    r = 0

    for c in range(cols):
        pivot = None
        for i in range(r, rows):
            if A[i][c] != 0:
                pivot = i
                break
        if pivot is None:
            continue

        A[r], A[pivot] = A[pivot], A[r]
        pivot_val = A[r][c]
        A[r] = [val / pivot_val for val in A[r]]

        for i in range(rows):
            if i != r:
                factor = A[i][c]
                A[i] = [A[i][j] - factor * A[r][j] for j in range(cols)]

        r += 1
        if r == rows:
            break

    return A

def print_matrix(matrix):
    for row in matrix:
        formatted = []
        for val in row:
            if val.denominator == 1:
                formatted.append(str(val.numerator))
            else:
                formatted.append(f"{val.numerator}/{val.denominator}")
        print("[" + "  ".join(formatted) + "]")

def get_user_matrix():
    print("Enter the number of rows:")
    rows = int(input())
    print("Enter the number of columns:")
    cols = int(input())

    matrix = []
    print("Enter each row with space-separated values (e.g., 1 2 3):")
    for i in range(rows):
        while True:
            try:
                row = input(f"Row {i+1}: ").strip().split()
                if len(row) != cols:
                    raise ValueError("Incorrect number of columns.")
                matrix.append([Fraction(val) for val in row])
                break
            except Exception as e:
                print(f"Invalid input: {e}. Please try again.")
    return matrix

# Main execution
user_matrix = get_user_matrix()
rref_matrix = rref_fraction(user_matrix)
print("\nRREF of the matrix:")
print_matrix(rref_matrix)
