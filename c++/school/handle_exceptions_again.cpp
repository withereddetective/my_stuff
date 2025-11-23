//Kyle Haynes
//12.5 Performance Assessment: Throw and Handle Exceptions
//November 23th, 2025

#include <iostream>
#include <stdexcept>
using namespace std;

// this function takes two positive arguements and returns their division
// it throws an exception if b argument is 0
float divideAByB(int a, int b){

    // if b is 0, throw an exception
    if (b == 0) {
        throw invalid_argument("divideAByB arguements must not be zero");
    }

    return a / b;

}

// this function takes two positive arguements and returns their sum
// it throws an exception if either argument is negative
int addPositiveNumbers(int a, int b){

    // if negative, throw an exception
    if (a <= 0 || b <= 0) {
        throw 999;
    }

    return a + b;

}

int main(){

    try{

        // valid cases
        cout << divideAByB(10, 2) << endl;
        cout << addPositiveNumbers(5, 7) << endl;

        // invalid cases
        cout << divideAByB(10, 0) << endl;
        cout << addPositiveNumbers(5, -3) << endl;

    } catch (invalid_argument const& e){
        // handle the exception
        cerr << e.what() << endl;
    } catch (int e){
        // handle the exception
        cerr << "addPositiveNumbers arguements must be positive. error code: " << e << endl;
    }

}