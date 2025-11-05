import random

characters = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z', ',', '.', '<', '>', '?', '/', ';', ':', '[', ']', '{', '}', '|', '-', '_', '+', '=', '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')']
possible_characters = len(characters)
password_length = random.randint(10, 50)
password = ""

for i in range(password_length):
    password += characters[random.randint(0, possible_characters - 1)]

print(password)