import random
def mySort(lst):
    x = 100
    new_lst = []
    while True:
        if len(lst) == 0:
            break
        for i in range(len(lst)):
            if x > lst[i]:
                x = lst[i]
        new_lst.append(x)
        lst.remove(x)
        x = 100
    return new_lst
lst = []
for i in range(10):
    num = random.randint(1, 100)
    lst.append(num)
print(mySort(lst))