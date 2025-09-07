//Kyle Haynes
//2.8 Performance Assessment: Pseudocode and C++ Code
//September 6th, 2025

#include <iostream>
#include <string>

using namespace std;

int main()
{

    // declaring variables
    float month_rain1, month_rain2, month_rain3, sum, avg;
    string month_name1, month_name2, month_name3;
    
    // getting the names of the months into string variables
    cout << "enter the names of your three months: \n";
    cin >> month_name1;
    cin >> month_name2;
    cin >> month_name3;
    
    // getting the rainfall amounts into float variables
    cout << "enter the rainfall amounts of your three months: \n";
    cin >> month_rain1;
    cin >> month_rain2;
    cin >> month_rain3;

    // getting the average
    sum = month_rain1 + month_rain2 + month_rain3;
    avg = sum / 3;

    // the final output
    cout << "The average rainfall for " << month_name1 << ", " << month_name2 << ", and " << month_name3 << " is " << avg << " inches.";

}