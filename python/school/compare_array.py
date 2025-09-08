def comp(a, b):
    if a is None or b is None:
        return False
    a = list(a)
    b = list(b)
    for i in range(len(a)):
        if a[i] * a[i] not in b:
            return False
    return True

a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
print(comp(a, b))