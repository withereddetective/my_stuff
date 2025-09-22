#include <iostream>
#include <string>
#include <stdexcept>
using namespace std;

int add(int num1, int num2){
    return num1 + num2;
}

int sub(int num1, int num2){
    return num1 - num2;
}

int mul(int num1, int num2){
    return num1 * num2;
}

float divide(int numerator, int denominator){
    if (denominator == 0){
        throw runtime_error("Division by zero is not allowed.");
    }
    
    float num1 = numerator;
    float num2 = denominator;
    return num1 / num2;
}

int main(){

    int num1, num2;
    string opp;
    cout << "what is your initial number";
    cin >> num1;

    while (true)
    {
        
        cout << "what is the first 3 letters of your operation?";
        cin >> opp;

        cout << "what is the number you will operate with?";
        cin >> num2;

        try{
            int result = divide(5, 0);
            cout << "result is " << result;
        } catch(const runtime_error& e){
            cerr << "error: " << e.what();
        } catch(...) { // literally anything other error that i didn't think of
            cerr << "unknown error occured";
        }
        

    }
    

}