//Kyle Haynes
//5.6 Performance Assessment: Using do...while() Loops
//September 27th, 2025

#include <iostream>
#include <random>
using namespace std;

int main(){

    // creating the random number generator
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> distrib(1, 20);

    // declaring variables
    int user_input;
    int random_number = distrib(gen);

    do{
        
        // getting user input
        cout << "guess a number between 1 and 20: ";
        cin >> user_input;

        // output depending on variables
        if (user_input == random_number){
            
            cout << "correct.";

        } else if (user_input > random_number){

            cout << "too high!";

        } else {

            cout << "too low!";

        }
        cout << endl;

    } while (user_input != random_number);
}