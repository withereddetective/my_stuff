import math
lst = [["Miami", "Atlanta", "Dallas", "Los Angeles"], ["New York", "Chicago", "Portland", "Sacramento"]]

def flip_list_order(lst):
    opp_list = []
    for i in range(len(lst)):
        opp_list.append([])
        for j in range(len(lst[i])):
            num = abs((j + 1) - len(lst[i]))
            opp_list[i].append(lst[i][num])
    return opp_list

def print_lists(org_list, opp_list):
    for i in range(len(org_list)):
        for j in range(len(org_list[i])):
            print(org_list[i][j], end= " ")
        print("\n", end= "")
    print("\n", end= "")
    for x in range(len(opp_list)):
        for y in range(len(opp_list[x])):
            print(opp_list[x][y], end= " ")
        print("\n", end= "")

print_lists(lst, flip_list_order(lst))