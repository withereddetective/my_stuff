lst = []
num = int(input("give num: "))
for digit in str(num):
    lst.append(int(digit))
for i in range(len(lst)):
    x = lst[i]
    while x - 1 >= 2:
        x -= 1
        lst[i] *= x
print("the sum of the factorial of the digits is " + str(sum(lst)))