//Kyle Haynes
//12.3 Guided Practice: Throwing Exceptions
//November 23th, 2025

#include <iostream>
#include <stdexcept>
using namespace std;

// this function takes two positive arguements and returns their sum
// it throws an exception if either argument is negative
int addPositiveNumbers(int a, int b){

    // if negative, throw an exception
    if (a < 0 || b < 0) {
        throw invalid_argument("addPositiveNumbers arguements must be positive");
    }

    return a + b;

}

int main(){

    try{

        // valid case
        cout << addPositiveNumbers(5, 5) << endl;

        // invalid case
        cout << addPositiveNumbers(-1, 5) << endl;

    } catch (invalid_argument const& e){
        // handle the exception
        cerr << e.what() << endl;
    }

}