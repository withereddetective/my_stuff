//Kyle Haynes
//5.5 Performance Assessment: Using while() Loops
//September 27th, 2025

#include <iostream>
using namespace std;

int main(){

    // declaring and initializing variables
    int passcode = 753291;
    int user_input;
    
    while(true){

        // getting user input
        cout << "what is the password?: ";
        cin >> user_input;

        if (user_input == passcode){
            
            // display message and end program
            cout << endl << "correct.";
            break;

        } else {

            // display message and restart loop
            cout << endl << "try again." << endl;

        }
    }
}