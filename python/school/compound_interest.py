import math

def calculate_comp_interest(goal, rate, times_compounded, years):
    return round(goal / (math.pow(1 + ((rate / 100) / times_compounded), times_compounded * years)))

print("your initial investment should be " + str(calculate_comp_interest(int(input("what is your amount goal?: ")), int(input("what is your rate?: ")), int(input("what is your number of times compounded per year?: ")), int(input("how many years will you invest?: ")))))
