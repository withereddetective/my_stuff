print("welcome")
min = int(input("what is your minimum of the range?: "))
max = int(input("what is your maximum of the range?: "))
num_list = []
fin_list = []
for i in range(min, max):
    num = str(i)
    num_list.clear()
    for j in num:
        num_list.append(j)
    for index in range(len(num_list)):
        num_list[index] = int(num_list[index])**(index+1)
    if sum(num_list) == i:
        fin_list.append(i)
print(fin_list)