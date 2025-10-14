//Kyle Haynes
//7.5 Performance Assessment: Store Values in an Array then Display Them
//October 12th, 2025

#include <iostream>
using namespace std;

int main(){

    // declarations
    int counter;
    int numbers[5] = {0};

    // loop to get numbers from user
    for (counter = 0; counter < 5; counter++){
        
        // prompt user
        cout << "enter number: ";
        cin >> numbers[counter];

    }
    
    // output numbers in intial order
    cout << "the initial order is: ";
    for (counter = 0; counter < 5; counter++){

        if (counter == 4){

            cout << numbers[counter];

        } else {

            cout << numbers[counter] << ", ";

        }

    }
    cout << endl;

    // output numbers in reverse order
    cout << "the reverse order is: ";
    for (counter = 4; counter >= 0; counter--){

        if (counter == 0){

            cout << numbers[counter];

        } else {

            cout << numbers[counter] << ", ";
            
        }

    }

    cout << endl << "thank you for using this program";

}