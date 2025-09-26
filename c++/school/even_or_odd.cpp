//Kyle Haynes
//3.3 Guided Practice: Use an "If" Statement to Decide if a Value is Odd or Even
//September 13th, 2025

#include <iostream>

using namespace std;

int main(){

    // declare
    int userValue;

    // get user input
    cout << "enter a number: ";
    cin >> userValue;

    // determine if even or odd
    if (userValue % 2 == 1){

        cout << "number is odd.";

    } else {

        cout << "number is even";
        
    }
    

}
