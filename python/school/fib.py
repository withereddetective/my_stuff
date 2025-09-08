def fib(num: int) -> int:
    if num == 1 or num == 2:
        return 1
    elif num <= 0:
        return 0
    
    return fib(num-1) + fib(num-2)

print(fib(int(input("give num: "))))