from fractions import Fraction

def inverse_matrix(matrix):
    size = len(matrix)
    # Check if matrix is square
    if any(len(row) != size for row in matrix):
        raise ValueError("Matrix must be square to compute its inverse.")

    # Create augmented matrix [A | I]
    A = [[Fraction(val) for val in row] for row in matrix]
    I = [[Fraction(int(i == j)) for j in range(size)] for i in range(size)]
    augmented = [A[i] + I[i] for i in range(size)]

    # Perform Gauss-Jordan elimination
    for r in range(size):
        # Find pivot
        pivot = None
        for i in range(r, size):
            if augmented[i][r] != 0:
                pivot = i
                break
        if pivot is None:
            raise ValueError("Matrix is singular and cannot be inverted.")

        # Swap rows
        augmented[r], augmented[pivot] = augmented[pivot], augmented[r]

        # Normalize pivot row
        pivot_val = augmented[r][r]
        augmented[r] = [val / pivot_val for val in augmented[r]]

        # Eliminate other rows
        for i in range(size):
            if i != r:
                factor = augmented[i][r]
                augmented[i] = [augmented[i][j] - factor * augmented[r][j] for j in range(2 * size)]

    # Extract inverse from augmented matrix
    inverse = [row[size:] for row in augmented]
    return inverse

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
    inverse = inverse_matrix(user_matrix)
    print("\nInverse of the matrix:")
    print_matrix(inverse)
except ValueError as e:
    print(f"Error: {e}")
