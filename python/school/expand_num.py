def expand_num(num):
    string = ""
    for i in range(len(num)):
        if num[i] != "0":
            string = string + num[i]
            for j in range(len(num) - (i + 1)):
                string = string + "0"
            if i != len(num) - 1:
                string = string + " + "
    return string

print(expand_num(str(int(input("give me num: ")))))