#include <iostream>
using namespace std;

int main(){

    // declarations
    int length, width;

    // getting user input
    cout << "what length do you want your rectangle?: ";
    cin >> length;
    cout << "what width fo you want your rectangle?: ";
    cin >> width;


    // output top line
    cout << " ";
    for (int i = 0; i < length; i++){
        
        cout << "_";

    }
    cout << endl;

    // output both side lines
    for (int i = 0; i < width; i++){
        
        cout << "|";

        for (int j = 0; j < length; j++){
            
            cout << " ";

        }
        
        cout << "|" << endl;

    }

    // output bottom line
    cout << " ";
    for (int i = 0; i < length; i++){
        
        cout << "¯";

    }
}