//Kyle Haynes
//7.4 Guided Practice: Sum of Array Elements
//October 12th, 2025

#include <iostream>
using namespace std;

int main(){

    // declarations
    int sum = 0;
    int counter;
    int numbers[10] = {0};

    // loop to get numbers from user
    for (counter = 0; counter <= 9; counter++){
        
        // prompt user
        cout << "enter number: ";
        cin >> numbers[counter];

    }
    
    // loop to sum numbers
    for (counter = 0; counter <= 9; counter++){

        sum += numbers[counter];

    }

    // output
    cout << "the sum is: " << sum;

}