//Kyle Haynes
//8.3 Guided Practice: Passing an Array to a Function
//October 19th, 2025

#include <iostream>
using namespace std;

// prototyping function
int sumArray(int numArray[], int size_of_array);

int main(){

    // initializing
    int numbers[] = {23, 44, 52, 46, 86, 223, 423, 45, 67, 12};
    int size_of_array = sizeof(numbers) / sizeof(numbers[0]);

    // output sum
    cout << sumArray(numbers, size_of_array);

}

int sumArray(int numArray[], int size_of_array){

    int sum = 0;

    for (int i = 0; i < size_of_array; i++){
        
        sum = sum + numArray[i];

    }

    return sum;

}