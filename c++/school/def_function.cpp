//Kyle Haynes
//6.3 Guided Practice: User-Defined Functions
//October 5th, 2025

#include <iostream>
using namespace std;

// function prototype
void DisplayMessage();

int main(){

    cout << "this program will print out a message from inside a function" << endl;

    // call function
    DisplayMessage();

}

// making the function
void DisplayMessage(){

    cout << "this is a message from inside the function" << endl;

}