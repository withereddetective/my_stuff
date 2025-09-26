//Kyle Haynes
//3.5 Guided Practice: Using a switch Statement
//September 13th, 2025

#include <iostream>
using namespace std;

int main(){

    // declare
    int menuOption;

    // welcome message
    cout << "welcome to the pizza palace!!" << endl;
    cout << "please choose from the following options: " << endl;
    cout << endl;

    // menu
    cout << "1. Small Pepperoni Pizza" << endl;
    cout << "2. Large Pepperoni Pizza" << endl;
    cout << "3. Small Sausage Pizza" << endl;
    cout << "4. Large Sausage Pizza" << endl;
    cout << "5. Small Supreme Pizza" << endl;
    cout << "6. Large Supreme Pizza" << endl;
    cout << endl;

    // get user input
    cout << "what option would you like?: ";
    cin >> menuOption;

    // output based off of user input
    switch(menuOption){
        case 1:{

            cout << "you have chosen menu option 1." << endl;
            cout << "one small pepperoni pizza coming up!";
            break;

        }
        case 2:{

            cout << "you have chosen menu option 2." << endl;
            cout << "one large pepperoni pizza coming up!";
            break;

        }
        case 3:{

            cout << "you have chosen menu option 3." << endl;
            cout << "one small sausage pizza coming up!";
            break;

        }
        case 4:{

            cout << "you have chosen menu option 4." << endl;
            cout << "one large sausage pizza coming up!";
            break;

        }
        case 5:{

            cout << "you have chosen menu option 5." << endl;
            cout << "one small supreme pizza coming up!";
            break;

        }
        case 6:{

            cout << "you have chosen menu option 6." << endl;
            cout << "one large supreme pizza coming up!";
            break;

        }
        default:{

            cout << "invalid menu choice!";
            break;

        }
    }
}