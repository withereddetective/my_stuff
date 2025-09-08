inputted_string = input("what is your string?: ")

def get_first_repeating_letter(string):
    lower_string = string.lower()
    for i in lower_string:
        x = 0
        for j in lower_string:
            if i == j:
                x += 1
        if x < 2:
            return string[lower_string.index(i)]
    return ""

print(get_first_repeating_letter(inputted_string))