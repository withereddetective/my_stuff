def fib(num: int) -> int:
    return 1 if (num == 1 or num == 2) else (0 if (num <= 0) else fib(num-1) + fib(num-2))

print(fib(int(input("give num: "))))