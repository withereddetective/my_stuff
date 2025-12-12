def situationA(listOfNumbers: list):
    sum = 0
    for i in range(len(listOfNumbers)):
        if isinstance(listOfNumbers[i], int):
            if listOfNumbers[i] % 2 == 1:
                sum += listOfNumbers[i]
    print("the sum of all odd numbers in the list is " + str(sum))

def situationB(num: int) -> int:
    if num < 0:
        return 0
    elif num > 30:
        return num * 2
    else:
        return abs(num - 30)

def situationC(num: int) -> list:
    binary_list = []
    if num == 0:
        binary_list.append(0)
    elif num < 0:
        binary_list.append("negative numbers not allowed")
    while num > 0:
        if num % 2 == 1:
            binary_list.insert(0, 1)
            num -= 1
        else:
            binary_list.insert(0, 0)
        num /= 2
    return binary_list

if __name__ == "__main__":
    situationA(["rum", 73, 57, 500, 69, 84, 72, 2763, "Kyle", 69, "doom", "fantasy 11", "magic the gathering 42", 67, 42])
    
    print(situationB(-5))
    print(situationB(12))
    print(situationB(42))
    
    print(situationC(5))
    print(situationC(0))
    print(situationC(42))