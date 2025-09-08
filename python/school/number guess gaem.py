import random

num = random.randint(1, 1000)
x = 0
print("welcome to the number guessing game")
print("you can guess a range or the number")
print("remember that guessing a range wont win you the game.")
while True:
    while True:
        guess_type = input("do you want to guess a range or a number? (range/num): " + str(num))
        if guess_type == 'range' or guess_type == 'num':
            break
        else:
            print("i asked for you to either input range or num, nothing else.")
    if guess_type == 'range':
        guess_r1 = int(input("what do you want your minimum number in the range to be?: "))
        guess_r2 = int(input("what do you want your maximum number in the range to be?: "))
        x += 1
        if num > guess_r1 and num < guess_r2:
            print("your number is in that range")
        else:
            print("your number is not in that range")
    if guess_type == 'num':
        guess = int(input("what is your guess?: "))
        x += 1
        if num == guess:
            print("correct guess.")
            print("you took " + str(x) + " guesses to get that right.")
            repeat = input("do you want to play again? (y for yes)")
            if repeat == 'y':
                num = random.randint(1, 1000)
                x = 0
            else:
                break
        else:
            if guess > num - 10 or guess < num + 10:
                print("you are within 10 of the number")
            else:
                print("wrong, try again.")
