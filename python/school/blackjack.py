import random
# i dont feel like doing comments
drawn_cards = [[], []]

class hand:
    global drawn_cards
    def __init__(self):
        self.num = []
        self.num_print = []
        self.suit = []
    
    def check_if_card_drawn(self, num, suit):
        for i in range(len(drawn_cards[0])):
            if drawn_cards[0][i] == num and drawn_cards[1][i] == suit:
                return True
        return False

    def draw_card(self):
        draw_num = random.randint(1, 13)
        draw_suit = random.randint(1, 4)
        while self.check_if_card_drawn(draw_num, draw_suit):
            draw_num = random.randint(1, 13)
            draw_suit = random.randint(1, 4)
        if draw_num > 10:
            self.num.append(10)
        else:
            self.num.append(draw_num)
        self.num_print.append(draw_num)
        self.suit.append(draw_suit)
        drawn_cards[0].append(draw_num)
        drawn_cards[1].append(draw_suit)
    
    def print_cards(self, num_list):
        for num in num_list:
            if num == 1:
                print("an ace, ", end="")
                if sum(self.num) < 22:
                    if 1 in self.num:
                        self.num[self.num.index(1)] = 11
                if sum(self.num) > 21:
                    if 11 in self.num:
                        self.num[self.num.index(11)] = 1
            elif num == 2:
                print("a two, ", end="")
            elif num == 3:
                print("a three, ", end="")
            elif num == 4:
                print("a four, ", end="")
            elif num == 5:
                print("a five, ", end="")
            elif num == 6:
                print("a six, ", end="")
            elif num == 7:
                print("a seven, ", end="")
            elif num == 8:
                print("an eight, ", end="")
            elif num == 9:
                print("a nine, ", end="")
            elif num == 10:
                print("a ten, ", end="")
            elif num == 11:
                print("a jack, ", end="")
            elif num == 12:
                print("a queen, ", end="")
            elif num == 13:
                print("a king, ", end="")
            
        print("\nthe total is " + str(sum(self.num)))

    def clear_hand(self):
        self.num_print = []
        self.num = []
        self.suit = []

dealer = hand()
player = hand()

def winner(player_list, dealer_list):
    print("\n")
    print("the dealer had ", end="")
    dealer.print_cards(dealer.num_print)
    print("you had ", end="")
    player.print_cards(player.num_print)
    print("\n")

    if sum(player_list) > 21:
        print("over 21, you lose")
    elif sum(dealer_list) > 21:
        print("dealer over 21, you win")
    else:
        if sum(player_list) > sum(dealer_list):
            print("player wins")
        elif sum(player_list) < sum(dealer_list):
            print("player loses")
        else:
            print("draw")
    
    player.clear_hand()
    dealer.clear_hand()

def game():
    for i in range(2):
        player.draw_card()
        dealer.draw_card()

    while sum(dealer.num) < 16:
        dealer.draw_card()
    
    print("\nyou have ", end="")
    player.print_cards(player.num_print)
    while True:
        decision = input("\nhit or fold?: ")
        if decision == 'hit' or decision == 'fold':
            if decision == 'hit':
                player.draw_card()
                print("you have ", end="")
                player.print_cards(player.num_print)
                if sum(player.num) > 21:
                    print('bust')
                    winner(player.num, dealer.num)
                    break
                elif sum(player.num) == 21:
                    print('blackjack')
                    winner(player.num, dealer.num)
                    break
            else:
                winner(player.num, dealer.num)
                break
        else:
            print('invalid input')

print("welcome to blackjack")
print("an ace has a value of 1 or 11")
print("the jack, queen and king each has a value of 10")
print("its just you and the dealer, game start!")
game()
while True:
    x = input("do you want to play again? (y/n): ")
    if x == 'y':
        game()
    elif x == 'n':
        print("thanks for playing")
        break
    else:
        print('invalid input')