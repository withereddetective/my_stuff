num_list = []

try:
    with open('sample.txt', 'r') as file:
        content = file.read()
except FileNotFoundError:
    print("The file does not exist.")

line_split = content.split("\n")
for i in range(len(line_split)):
    num_list.append(float(line_split[i]))

for i in range(len(num_list)):
    print("$" + str(num_list[i]))
    print("")
print("total: " + str(sum(num_list)))