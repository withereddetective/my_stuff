//Kyle Haynes
//9.5 Performance Assessment: Letter Frequency
//October 26th, 2025

#include <iostream>
#include <string>
using namespace std;

int main(){

    // declare
    string userInput;
    char letterToCount;
    int letterOccurances = 0;

    // get user input
    cout << "enter a string: ";
    getline(cin, userInput);
    cout << endl << "what letter do you wanna search for?: ";
    cin >> letterToCount;

    // count
    for (int i = 0; i < userInput.length(); i++){
        
        if (userInput[i] == letterToCount){
            
            letterOccurances++;

        }

    }

    // output
    cout << endl << "the number of times the letter " << letterToCount << " shows up in the inputted string is " << letterOccurances;

}