//Kyle Haynes
//2.8 Performance Assessment: Pseudocode and C++ Code
//September 6th, 2025

#include <iostream>

using namespace std;

int main()
{

    // declare variables
    float gallons_held_on_one_tank, amount_of_miles_on_one_tank, miles_per_gallon;

    // get the user input for gallons on one tank in a float variable
    cout << "how many gallons can your car hold?: \n";
    cin >> gallons_held_on_one_tank;

    // get the user input for miles on one tank in a float variable
    cout << "how many miles can your car drive on a full tank of gas?: \n";
    cin >> amount_of_miles_on_one_tank;

    // get the miles per gallon using math in a float variable
    miles_per_gallon = amount_of_miles_on_one_tank / gallons_held_on_one_tank;

    // final output
    cout << "The miles per gallon for your car is " << miles_per_gallon << " mpg.";

}