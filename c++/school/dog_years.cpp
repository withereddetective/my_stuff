//Kyle Haynes
//6.6 Performance Assessment: Write and Call Two User Defined Functions
//October 5th, 2025

#include <iostream>
using namespace std;

// prototyping functions
int get_dog_age();
int convert_dog_age(int age);

int main(){

    // calling functions
    int dog_age = convert_dog_age(get_dog_age());

    // end message
    cout << "your dog's age in dog years is: " << dog_age;

}

int get_dog_age(){

    // declare variable
    int age;

    // getting user input
    cout << "what is your dog's age?: ";
    cin >> age;

    // return age
    return age;

}

int convert_dog_age(int age){

    return age * 7;

}