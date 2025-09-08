name_list = []
year_list = []
month_list = []
day_list = []

def eventName():
    name = input("give me the event name: ")
    name_list.append(name)

def eventYear():
    while True:
        year = input("give me the event year: ")
        x = year.isalpha()
        if not x:
            if len(year) == 4:
                year = int(year)
                year_list.append(year)
                break
            else:
                print("not a valid year")
        else:
            print("invalid input")

def eventMonth():
    while True:
        month = input("give me the event month (type out the month): ")
        month = month.lower()
        x = month.isalpha()
        if x:
            if month == 'january' or month == 'february' or month == 'march' or month == 'april' or month == 'may' or month == 'june' or month == 'july' or month == 'august' or month == 'september' or month == 'october' or month == 'november' or month == 'december':
                month_list.append(month)
                break
            else:
                print("input not a month")
        else:
            print("invalid input")

def eventDay():
    while True:
        day = input("give me the event day: ")
        x = day.isalpha()
        if not x:
            day = int(day)
            if month_list[len(month_list)-1] == 'january' or month_list[len(month_list)-1] == 'march' or month_list[len(month_list)-1] == 'may' or month_list[len(month_list)-1] == 'july' or month_list[len(month_list)-1] == 'august' or month_list[len(month_list)-1] == 'october' or month_list[len(month_list)-1] == 'december':
                if not day > 31 and not day < 1:
                    day_list.append(day)
                    break
                else:
                    print("month has 31 days")
            elif month_list[len(month_list)-1] == 'april' or month_list[len(month_list)-1] == 'june' or month_list[len(month_list)-1] == 'september' or month_list[len(month_list)-1] == 'november':
                if not day > 30 and not day < 1:
                    day_list.append(day)
                    break
                else:
                    print("month has 30 days")
            else:
                if year_list[len(year_list)-1] % 4 == 0:
                    if not year_list[len(year_list)-1] % 100 == 0:
                        if not day > 29 and not day < 1:
                            day_list.append(day)
                            break
                        else:
                            print("month has 29 days")
                    else:
                        if year_list[len(year_list)-1] % 400 == 0:
                            if not day > 29 and not day < 1:
                                day_list.append(day)
                                break
                            else:
                                print("month has 29 days")
                        else:
                            if not day > 28 and not day < 1:
                                day_list.append(day)
                                break
                            else:
                                print("month has 28 days")
                else:
                    if not day > 28 and not day < 1:
                        day_list.append(day)
                        break
                    else:
                        print("month has 28 days")
        else:
            print("invalid input")

def addEvent():
    eventName()
    eventYear()
    eventMonth()
    eventDay()

print("welcome to the event planner")
while True:
    z = input("do you want to add to the event list? (y/n): ")
    if z == 'y':
        addEvent()
    elif z == 'n':
        if len(name_list) == 0:
            print("why exit with no events?")
        else:
            for i in range(len(name_list)):
                print(" ")
                print("event " + str(i+1) + ":")
                print(name_list[i])
                print("date: " + month_list[i] + " " + str(day_list[i]) + ", " + str(year_list[i]))
            break
    else:
        print("invalid input")