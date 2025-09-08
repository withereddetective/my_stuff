import random
list_of_words = ['citizen', 'flu', 'complex', 'journal', 'repeat', 'affect', 'bird', 'mercy', 'window', 'craftsman']
num = random.randint(0, 9)
word = list_of_words[num]
word_list = []
underscore = []
guesses = []
tries = 5
for letter in word:
    word_list.append(letter)
    underscore.append('_')
print("welcome to hangman!")
while True:
    guess = input("guess a letter: ")
    guess = guess.lower()
    x = guess.isalpha()
    if x and len(guess) == 1:
        if guess not in guesses:
            guesses.append(guess)
            if guess in word:
                for i in range(len(word)):
                    if guess == word_list[i]:
                        underscore[i] = word_list[i]
                print(underscore)
                if '_' not in underscore:
                    print("congrats! you win!")
                    break
            else:
                tries -= 1
                print("incorrect guess")
                if tries > 0:
                    print("you have " + str(tries) + " incorrect guesses left")
                else:
                    print("game over.")
                    print("the word was " + word)
                    break
        else:
            print("already guessed that.")
    else:
        print("invalid input.")