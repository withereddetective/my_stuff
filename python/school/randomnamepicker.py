import random
print("this is the random name picker")
name_list = ['kyle', 'john', 'miles', 'evan', 'jocelyn', 'mariah', 'mason', 'alaster', 'charles', 'zak', 'colby',]
while True:
    if len(name_list) == 1:
        print(name_list[0])
        print("no more names")
        break
    num = random.randint(0, len(name_list)-1)
    print(name_list[num])
    while True:
        decision1 = input("do you want to delete that name? (y/n): ")
        if decision1 == 'y':
            name_list.pop(num)
            break
        elif decision1 == 'n':
            break
        else:
            print("invalid input")
    while True:
        decision2 = input("do you want another name? (y/n): ")
        if decision2 == 'y':
            print("", end="")
            break
        elif decision2 == 'n':
            break
        else:
            print("invalid input")
    if decision2 == 'n':
        break