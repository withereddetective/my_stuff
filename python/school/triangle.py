def triangle(num: int, start_num) -> int:
    if num <= 0:
        return  
    x = "*"
    x *= num * 2 - 1
    y = x.center(start_num, " ")
    print(y)
    triangle(num-1, start_num)

a = int(input("give num: "))
b = a * 2
triangle(a, b)