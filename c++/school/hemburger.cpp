//Kyle Haynes
//3.7 Performance Assessment: Using switch Statements
//September 13th, 2025

#include <iostream>
using namespace std;

int main(){

    // declare
    int menuOption;

    // welcome message
    cout << "welcome to skinny's hamburgers, the best burger place in weatherford!!" << endl;
    cout << "please choose from the following options: " << endl;
    cout << endl;

    // menu
    cout << "1. Big Skinny" << endl;
    cout << "2. Fat Burger" << endl;
    cout << "3. Boss Hog" << endl;
    cout << "4. Steak Sandwich" << endl;
    cout << "5. Catfish Basket" << endl;
    cout << "6. Fried Chicken Plate" << endl;
    cout << endl;

    // get user input
    cout << "what option would you like?: ";
    cin >> menuOption;

    // output based off of user input
    switch(menuOption){
        case 1:{

            cout << "you have chosen menu option 1." << endl;
            cout << "your big skinny will be out in ~7 minutes.";
            break;

        }
        case 2:{

            cout << "you have chosen menu option 2." << endl;
            cout << "your fat burger will be out in ~9 minutes.";
            break;

        }
        case 3:{

            cout << "you have chosen menu option 3." << endl;
            cout << "your boss hog will be out in ~10 minutes.";
            break;

        }
        case 4:{

            cout << "you have chosen menu option 4." << endl;
            cout << "your steak sandwich will be out in ~5 minutes.";
            break;

        }
        case 5:{

            cout << "you have chosen menu option 5." << endl;
            cout << "your catfish basket will be out in ~8 minutes.";
            break;

        }
        case 6:{

            cout << "you have chosen menu option 6." << endl;
            cout << "your fried chicken plate will be out in ~6 minutes.";
            break;

        }
        default:{

            cout << "invalid menu choice!";
            break;

        }
    }
}