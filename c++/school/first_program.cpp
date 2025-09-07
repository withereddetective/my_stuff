//Kyle Haynes
//2.7 Guided Practice: Creating your First C++ Program
//September 6th, 2025

#include <iostream>

using namespace std;

int main()
{

    int num1, num2, num3, num4, num5, sum;
    float avg;

    cout << "Enter five numbers: \n";
    cin >> num1;
    cin >> num2;
    cin >> num3;
    cin >> num4;
    cin >> num5;

    sum = num1 + num2 + num3 + num4 + num5;
    avg = sum / 5;

    cout << "\nYour average is: " << avg;

    return 0;

}