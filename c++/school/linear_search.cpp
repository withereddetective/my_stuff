//Kyle Haynes
//7.6 Performance Assessment: Linear Search
//October 12th, 2025

#include <iostream>
using namespace std;

int main(){

    // initializing
    int numbers[] = {23, 44, 52, 46, 86, 223, 423, 45, 67, 12};
    int size_of_array = sizeof(numbers) / sizeof(numbers[0]);

    // display array
    for (int i = 0; i < size_of_array; i++) {

        if (i == 9){

            cout << numbers[i] << endl;

        } else {

            cout << numbers[i] << ", ";

        }

    }

    // get user input
    int user_input;
    cout << "which number do you want the index for?: ";
    cin >> user_input;

    // find index
    bool if_outputted = false;
    for (int i = 0; i < size_of_array; i++){
        
        if (numbers[i] == user_input){

            cout << "the index of your input in the array is " << i;
            if_outputted = true;

        } else if (i == size_of_array - 1 && !if_outputted){

            cout << "your input isnt in the array buddy";

        }

    }
}