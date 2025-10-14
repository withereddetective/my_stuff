//Kyle Haynes
//7.3 Guided Practice: Largest/Smallest Array Values
//October 12th, 2025

#include <iostream>
using namespace std;

int main(){

    // declarations
    int largest, smallest, counter;

    // initializations
    int myArray[5] = {52, 65, 12, 23, 2};
    largest = 0;
    smallest = 0;

    for (counter = 0; counter <= 4; counter++){

        // setting the largest number if current number is larger
        if (myArray[counter] > largest){

            largest = myArray[counter];

        } else if (myArray[counter] <= smallest || smallest == 0) { // setting the smallest number if current number is smaller

            smallest = myArray[counter];

        }
    }

    cout << "the largest number is: " << largest << " the smallest number is: " << smallest;

}