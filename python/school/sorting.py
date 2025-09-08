products = []

class Item:
    def __init__(self, name, price, availability):
        self.name = name
        self.price = price
        self.availability = availability

try:
    with open('items.txt', 'r') as file:
        content = file.read()
except FileNotFoundError:
    print("The file does not exist.")

line_split = content.split("\n")
for i in range(int(line_split[0])):
    x = line_split[i + 1]
    y = x.split(" ")
    products.append(Item(y[0], float(y[1]), y[2]))

lst = []
cheapest = 0
for i in range(int(line_split[0])):
    if products[cheapest].name in lst:
        cheapest += 1
    for j in range(int(line_split[0])):
        if products[i].price < products[cheapest].price and products[i].name not in lst:
            cheapest = i
        elif products[i].price == products[cheapest].price and products[i].name not in lst:
            if products[i].availability == 'Immediately':
                cheapest = i
            elif products[i].availability == 'Soon':
                if products[cheapest].availability != 'Immediately':
                    cheapest = i
    lst.append(products[cheapest].name)

for i in range(int(line_split[0])):
    print(lst[i], end= " ")