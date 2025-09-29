//Kyle Haynes
//3.6 Performance Assessment: Using Else...If Statements
//September 13th, 2025

#include <iostream>
using namespace std;

int main(){

    // declare
    int userTimeEmployed;

    // get user input
    cout << "how many years have you been employed?: ";
    cin >> userTimeEmployed;

    // output depending on input
    if (userTimeEmployed >= 25){
        
        cout << "you recieve a gold watch!!";

    } else if (userTimeEmployed >= 15 and userTimeEmployed < 25){

        cout << "you recieve a silver pen!!";

    } else if (userTimeEmployed >= 5 and userTimeEmployed < 15){

        cout << "you recieve an attractive pin!!";

    } else if (userTimeEmployed >= 0 and userTimeEmployed < 5){

        cout << "you recieve a pat on the back!!";

    } else {

        cout << "you cannot have been employed for negative years!!";

    }
    

}