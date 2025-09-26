//Kyle Haynes
//4.5 Performance Assessment: Using for() Loops and if-else
//September 19th, 2025

#include <iostream>
using namespace std;

int main(){

    for (int i = 0; i <= 20; i++){

        cout << "the counter is at " << i << " which makes the counter ";

        if (i % 2 == 0){
            
            cout << "even.";

        } else{

            cout << "odd.";

        }

        cout << endl;

    }
}