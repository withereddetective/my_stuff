def sqrt(num):
    return num ** (1/2)

def cbrt(num):
    return num ** (1/3)

def cubic_formula(a, b, c, d):
    x = cbrt( ( ( -(b ** 3) / (27 * (a ** 3)) ) + ( (b * c) / (6 * (a ** 2) ) ) - ( d / (2 * a) ) ) + sqrt( ( ( ( -(b ** 3) / (27 * (a ** 3)) ) + ( (b * c) / (6 * (a ** 2)) ) - ( d / (2 * a) ) ) ** 2 ) + ( ( ( c / (2 * a) ) - ( (b ** 2) / (9 * (a ** 2) ) ) ) ** 3 ) ) )
    x += cbrt( ( ( -(b ** 3) / (27 * (a ** 3)) ) + ( (b * c) / (6 * (a ** 2) ) ) - ( d / (2 * a) ) ) - sqrt( ( ( ( -(b ** 3) / (27 * (a ** 3)) ) + ( (b * c) / (6 * (a ** 2)) ) - ( d / (2 * a) ) ) ** 2 ) + ( ( ( c / (2 * a) ) - ( (b ** 2) / (9 * (a ** 2) ) ) ) ** 3 ) ) )
    x -= ( b / (3 * a) )
    return x

print("if ax^3 + bx^2 + cx + d = 0, then use this program.")
a = int(input( "gimme the a value: " ))
b = int(input( "gimme the b value: " ))
c = int(input( "gimme the c value: " ))
d = int(input( "gimme the d value: " ))
print("your zeros are " + str(cubic_formula(a, b, c, d)))