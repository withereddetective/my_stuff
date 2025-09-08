def unique_in_order(string):
    fin_list = []
    num = 1
    for i in range(len(string)):
        if i == 0:
            fin_list.append(string[i])
        elif string[i] == fin_list[i - num]:
            num += 1
        else:
            fin_list.append(string[i])
    return fin_list

print(unique_in_order('AAAABBBCCDAABBB'))
print(unique_in_order('ABBCcAD'))
print(unique_in_order([1, 2, 2, 3, 3]))
print(unique_in_order((1, 2, 2, 3, 3)))