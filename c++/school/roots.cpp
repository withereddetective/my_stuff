//Kyle Haynes
//6.5 Guided Practice: Using Pre-Defined Functions (C++ Math Library)
//October 5th, 2025

#include <iostream>
#include <math.h>
using namespace std;

int main(){

    // declare variables
    int num1;
    float squareRoot, cubeRoot;

    // getting user input
    cout << "give me a number: ";
    cin >> num1;

    // getting roots
    squareRoot = sqrt(num1);
    cubeRoot = cbrt(num1);

    // output
    cout << "the square root is: " << squareRoot << endl;
    cout << "the cube root is: " << cubeRoot << endl;

}