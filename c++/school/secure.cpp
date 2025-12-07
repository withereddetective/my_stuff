//Kyle Haynes
//14.3 Guided Practice: Secure C++ Programming
//December 7th, 2025

#include <iostream>
#include <cstring>
using namespace std;

int main(){

    char buff[8];
    int pass = 0;

    cout << "Enter the password: ";
    cin >> buff;

    if (strcmp(buff, "password")){
        cout << "\nWrong Password!" << endl;
    } else {
        cout << "\nCorrect Password!" << endl;
        pass = 1;
    }

    if (pass){
        cout << "\n\nRoot privileges given to the user." << endl;
    }

    return 0;
}