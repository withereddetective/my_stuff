//Kyle Haynes
//14.5 Performance Assessment: Checking Passwords
//December 7th, 2025

#include <iostream>
#include <string>
using namespace std;

bool isStrongPassword(const string& password){

    // check length
    if(password.length() < 8){
        return false;
    }

    // declare flags
    bool hasUpper = false;
    bool hasLower = false;
    bool hasDigit = false;
    bool hasSpecial = false;

    // check for flags
    for(char ch : password){
        if(isupper(ch)){
            hasUpper = true;
        } else if(islower(ch)){
            hasLower = true;
        } else if(isdigit(ch)){
            hasDigit = true;
        } else if(!isalnum(ch)){
            hasSpecial = true;
        }
    }

    // return true if all flags are true
    return hasUpper && hasLower && hasDigit && hasSpecial;

}

int main(){

    cout << isStrongPassword("Password123!") << endl;   // true
    cout << isStrongPassword("weakpass") << endl;       // false
    cout << isStrongPassword("Short1!") << endl;        // false
    cout << isStrongPassword("NoSpecialChar1") << endl; // false
    cout << isStrongPassword("ALLUPPERCASE1!") << endl; // false

}