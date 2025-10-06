//Kyle Haynes
//6.4 Guided Practice: User-Defined Functions Using Parameters
//October 5th, 2025

#include <iostream>
using namespace std;

// function prototype
int multiply(int num1, int num2);

int main(){

    // declare variables
    int num1, num2;

    cout << "This program will ask you to enter 2 numbers and return their product" << endl;

    // getting user input
    cout << "enter first number: ";
    cin >> num1;
    cout << "enter second number: ";
    cin >> num2;

    // output
    cout << "the product is: " << multiply(num1, num2) << endl;

}

int multiply(int num1, int num2){

    return num1 * num2;

}