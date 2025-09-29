//Kyle Haynes
//3.4 Guided Practice: Using Else...If Statements to Make Multiple Decisions
//September 13th, 2025

#include <iostream>
using namespace std;

int main(){

    // declare
    int userNum;

    // get user input
    cout << "enter a number: ";
    cin >> userNum;

    // determine expressions relationship to 50 and output
    if (userNum < 50){
        
        cout << "number is less than 50";

    } else if (userNum > 50){

        cout << "number is greater than 50";

    } else {

        cout << "number is equal to 50";

    }
    

}