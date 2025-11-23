//Kyle Haynes
//12.4 Guided Practice: Throwing Exceptions
//November 23th, 2025

#include <iostream>
#include <stdexcept>
using namespace std;

// this function takes two positive arguements and returns their division
// it throws an exception if b argument is less than or equal to 0
int divideAByB(int a, int b){

    // if b is less than or equal to 0, throw an exception
    if (b <= 0) {
        throw invalid_argument("divideAByB arguements must be positive");
    }

    return a / b;

}

int main(){

    try{

        // valid case
        cout << divideAByB(10, 2) << endl;

        // invalid case
        cout << divideAByB(10, 0) << endl;

    } catch (invalid_argument const& e){
        // handle the exception
        cerr << e.what() << endl;
    }

}