import random

def get_int_input(message: str) -> int:  # gets an int input with exception handling
    try:
        return int(input(message))
    except Exception:
        print("input an integer.")
        return get_int_input(message)

def get_answer_type() -> str:  # getting the guess type with error handling for naughty users
    while True:
        guess_type = input("do you want to guess a range or a number? (range/num): ")
        if guess_type == 'range' or guess_type == 'num':
            return guess_type
        else:
            print("i asked for you to either input range or num, nothing else.")

def get_range(num: int):  # user inputs minimum and maximum and is told if the number is in the range
    guess_r1, guess_r2 = get_int_input("what do you want your minimum number in the range to be?: "), get_int_input("what do you want your maximum number in the range to be?: ")
    print("your number is in that range" if (num > guess_r1 and num < guess_r2) else "your number is not in that range")

def get_num(num: int, guesses: int):  # user actually guesses the number
    guess = get_int_input("what is your guess?: ")

    if num == guess:  # if user gets the correct number
        print("correct guess.\nyou took " + str(guesses) + " guesses to get that right.")
    
    else:  # if they are incorrect but within 10, they are told that fact. user then gets to try again
        print("you are within 10 of the number" if (guess > num - 10 and guess < num + 10) else "wrong, try again.")

def game():
    answer, guesses = random.randint(1, 1000), 0  # setup

    while True:
        guesses += 1  # keeping track of the guesses
        guess_type = get_answer_type()

        if guess_type == 'range':
            get_range(answer)
        
        elif guess_type == 'num':
            get_num(answer, guesses)
        
def main():
    print("welcome to the number guessing game\nyou can guess a range or the number\nremember that guessing a range wont win you the game.\n")

    while True:  # runs the game and then asks to either break the loop for start it over to run the game again
        game()
        repeat = input("do you want to play again? (y for yes)")
        if repeat == 'y':  # if the user only types 'y' then they get to play again
            num, guesses = random.randint(1, 1000), 0
        else:
            break

if __name__ == "__main__":
    main()