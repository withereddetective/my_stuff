//Kyle Haynes
//8.3 Guided Practice: Passing an Array to a Function
//October 19th, 2025

#include <iostream>
using namespace std;

// function prototype
void displayArray(int myArray[]);

int main(){

    // declare
    int myArray[9] = {0};

    // get user input
    for (int i = 0; i < 10; i++){
        
        cout << "enter a number: ";
        cin >> myArray[i];

    }
    
    displayArray(myArray);

}

// display the array values
void displayArray(int myArray[]){

    for (int i = 0; i < 10; i++){
        
        cout << myArray[i] << endl;

    } 

}