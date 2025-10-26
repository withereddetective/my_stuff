//Kyle Haynes
//9.6 Performance Assessment: Character Testing
//October 26th, 2025

#include <iostream>
#include <string>
using namespace std;

int main(){

    // declare
    string userInput;
    int upperOccurances = 0;
    int lowerOccurances = 0;
    int digitOccurances = 0;

    // get user input
    cout << "enter a string: ";
    getline(cin, userInput);
    cout << endl;

    for (int i = 0; i < userInput.length(); i++){

        if (userInput[i] >= 'A' && userInput[i] <= 'Z') {

            upperOccurances++;

        } else if (userInput[i] >= 'a' && userInput[i] <= 'z') {

            lowerOccurances++;

        } else if (userInput[i] != ' ') {

            digitOccurances++;

        }
        
    }

    cout << "there are " << upperOccurances << " uppercase letters in the string" << endl;
    cout << "there are " << lowerOccurances << " lowercase letters in the string" << endl;
    cout << "there are " << digitOccurances << " digits in the string" << endl;

}