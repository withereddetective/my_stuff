def days(d):
    money = 0
    for i in range(d):
        money += 40
    if d >= 3:
        money -= 20
    if d >= 7:
        money -= 50
    return "$" + str(money)

print(days(int(input("give amount of rental days: "))))