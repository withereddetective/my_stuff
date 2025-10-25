//Kyle Haynes
//9.3 Guided Practice: Determining the Length of Strings
//October 26th, 2025

#include <iostream>
#include <string>
using namespace std;

int main(){

    // declare
    string userInput;

    // get user input
    cout << "enter a string: ";
    getline(cin, userInput);

    // get string length
    int stringLength = userInput.length();

    // output length
    cout << "the length of the entered string is " << stringLength << ".\n" << endl;

    // print reverse of string
    cout << "the reverse of the entered string is ";
    for (int i = userInput.length(); i >= 0; i--){
        
        cout << userInput[i];

    }
    
}