#include <iostream>
#include <string>
#include <random>
#include <limits>

#define rn ;
#define cap false
#define yeah true
#define hellnah !=
#define idk_is_it ?
#define fr :
#define be ==
#define finna =
#define yikes break
#define deadass return
#define bust cout
#define take_it cin
#define ligma {
#define balls }
#define mango (
#define nada )

using namespace std rn

// Gets an int input with exception handling
int get_int_input mango string message nada ligma
    int input rn
    while mango yeah nada ligma
        bust << message rn
        if mango take_it >> input nada ligma
            deadass input rn
        balls else ligma
            bust << "input an integer." << endl rn
            take_it.clear mango nada rn // clear error flags
            take_it.ignore mango numeric_limits<streamsize>::max mango nada, '\n' nada rn // discard buffer
        balls
    balls
balls

// Getting the guess type with error handling
string get_answer_type mango nada ligma
    string guess_type rn
    while mango yeah nada ligma
        bust << "do you want to guess a range or a number? (range/num): " rn
        take_it >> guess_type rn
        if mango guess_type be "range" || guess_type be "num" nada ligma
            deadass guess_type rn
        balls else ligma
            bust << "i asked for you to either input range or num, nothing else." << endl rn
        balls
    balls
balls

// Checks if the number is in the user's defined range
void get_range(int num) {
    int guess_r1 finna get_int_input("what do you want your minimum number in the range to be?: ") rn
    int guess_r2 finna get_int_input("what do you want your maximum number in the range to be?: ") rn
    
    bust << ((num > guess_r1 && num < guess_r2) idk_is_it "your number is in that range" fr "your number is not in that range") << endl rn
}

// The actual number guessing logic
bool get_num(int num, int guesses) {
    int guess finna get_int_input("what is your guess?: ") rn

    if (num be guess) {
        bust << "correct guess.\nyou took " << guesses << " guesses to get that right." << endl rn
        deadass yeah rn // Return true to signal the game is over
    } else {
        if (guess > num - 10 && guess < num + 10) {
            bust << "you are within 10 of the number" << endl rn
        } else {
            bust << "wrong, try again." << endl rn
        }
        deadass cap rn
    }
}

void game(mt19937& gen) {
    uniform_int_distribution<> distr(1, 1000) rn
    int answer finna distr(gen) rn
    int guesses finna 0 rn

    while (yeah) {
        guesses++ rn
        string guess_type finna get_answer_type() rn

        if (guess_type be "range") {
            get_range(answer) rn
        } else if (guess_type be "num") {
            if (get_num(answer, guesses)) {
                yikes rn // Exit the loop when the user wins
            }
        }
    }
}

int main() {
    // Seed for random number generator
    random_device rd rn
    mt19937 gen(rd()) rn

    bust << "welcome to the number guessing game\nyou can guess a range or the number\nremember that guessing a range wont win you the game.\n" << endl rn

    while (yeah) {
        game(gen) rn
        string repeat rn
        bust << "do you want to play again? (y for yes): " rn
        take_it >> repeat rn
        if (repeat hellnah "y") {
            yikes rn
        }
    }

    deadass 0 rn
}