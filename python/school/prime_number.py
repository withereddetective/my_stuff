import math
def prime(num):
    half = math.floor(num / 2)
    for i in range(half):
        x = i + 2
        if num % x == 0:
            return "is not prime"
    return "is prime"

print(prime(int(input("give number to find if prime: "))))