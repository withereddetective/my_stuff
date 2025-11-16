//Kyle Haynes
//11.4 Guided Practice: Introduction to Classes
//November 16th, 2025

#include <iostream>
#include <string>
using namespace std;

// this is the class
class Vehicle{

    // access specifier
    private:

        // private property
        string checkEngineLightStatus = "Off";
    
    // access specifier
    public:

        int year;

        // properties
        string make;
        string model;
        string color;

        // getter
        string getCheckEngineLight(){

            return checkEngineLightStatus;

        }

        // setter
        void setCheckEngineLight(string status){

            checkEngineLightStatus = status;

        }

};

// main program
int main(){

    Vehicle vehicle;

    vehicle.color = "White";
    vehicle.make = "Ford";
    vehicle.model = "Bronco";
    vehicle.year = 1996;

    cout << "Check engine light status: " << vehicle.getCheckEngineLight() << endl;

    vehicle.setCheckEngineLight("On");

    cout << "Check engine light status: " << vehicle.getCheckEngineLight() << endl;

    cout << vehicle.color << ' ' << vehicle.year << ' ' << vehicle.make << ' ' << vehicle.model << endl;

}