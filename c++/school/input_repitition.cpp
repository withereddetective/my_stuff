//Kyle Haynes
//5.4 Guided Practice: Using a do...while() Loop for Repetition
//September 25th, 2025

#include <iostream>
using namespace std;

int main(){

    // declare and initialize
    char userAnswer = 'n';

    // print message until user enters value other than y or Y
    do {

        // output message
        cout << endl;
        cout << "C++ is fun!!" << endl;
        cout << endl;
        cout << "Enter y or Y to continue, any other key to exit: ";

        // get user input
        cin >> userAnswer;

    } while (userAnswer == 'y' || userAnswer == 'Y'); // condition to exit
}