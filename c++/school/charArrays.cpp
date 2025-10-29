//Kyle Haynes
//9.3 Guided Practice: Determining the Length of Strings
//October 26th, 2025

#include <iostream>
#include <string>
using namespace std;

int main() {

    // declarations
    string userInput;
    char charArray[] = {'C', '+', '+', ' ', 'i', 's', ' ', 'F', 'u', 'n', '!'};

    // get string from user:
    cout << "Enter a string: ";
    getline(cin, userInput);

    // get the length of the string
    int stringLength = userInput.length();

    // print out the length
    cout<< "The length of the string you entered is: " << stringLength << ".\n\n" << endl;

    // print out character array
    for (int i = 0; i < sizeof(charArray); ++i) {
        cout << charArray[i];
    }
    cout << "\n" << endl;

    // use sizeof() function to determine the length of the char array
    cout<<"The length is: " << sizeof(charArray);

}