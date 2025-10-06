//Kyle Haynes
//6.7 Performance Assessment: Call Pre-Defined Functions
//October 5th, 2025

#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main(){

    // declare variables
    string user_input, uppercase, first_five_letters;
    int str_length;

    // getting user input
    cout << "give me string: ";
    cin >> user_input;

    // getting length
    str_length = user_input.length();

    // getting uppercase
    uppercase = user_input;
    for (char &c : uppercase){
        
        c = toupper(c);

    }

    // getting first 5 letters
    first_five_letters = user_input.substr(0, 5);

    // output
    cout << "original string: " << user_input << endl;
    cout << "length of string: " << str_length << endl;
    cout << "string in all uppercase: " << uppercase << endl;
    cout << "first 5 letters of string: " << first_five_letters << endl;

}