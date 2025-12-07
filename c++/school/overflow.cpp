//Kyle Haynes
//14.4 Guided Practice: Buffer Overflow Conditions
//December 7th, 2025

#include <iostream>
using namespace std;

int main(){

    // declare an array of integers
    int n[10];

    // initialize array
    for (int i = 0; i <= 10; i++){
        n[i] = i + 100;
    }

    // output array
    for (int j = 0; j <= 10; j++){
        cout << "Element " << j << " = " << n[j] << "\n" << endl;
    }

    // output the 'tenth' element again
    // why is it different from the last value?

    cout << "Element " << 10 << " = " << n[10] << "\n" << endl;

}