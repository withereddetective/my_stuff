from fractions import Fraction

def rref_fraction(matrix):
    # Convert all entries to Fractions
    A = [[Fraction(val) for val in row] for row in matrix]
    rows, cols = len(A), len(A[0])
    r = 0  # pivot row
    
    for c in range(cols):
        # Find pivot row
        pivot = None
        for i in range(r, rows):
            if A[i][c] != 0:
                pivot = i
                break
        if pivot is None:
            continue  # no pivot in this column
        
        # Swap pivot row into position
        A[r], A[pivot] = A[pivot], A[r]
        
        # Normalize pivot row
        pivot_val = A[r][c]
        A[r] = [val / pivot_val for val in A[r]]
        
        # Eliminate other rows
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
                formatted.append(str(val.numerator))  # integer
            else:
                formatted.append(f"{val.numerator}/{val.denominator}")  # fraction
        print("[" + "  ".join(formatted) + "]")

# make the matrix:
M = [[4, 7, 0, 1],
     [-7, 6, 5, 6],
     [71, -5, 3, 1]]

rref_matrix = rref_fraction(M)
print_matrix(rref_matrix)