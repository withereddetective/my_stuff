//Kyle Haynes
//11.7 Performance Assessment: Create an Employee Class
//November 16th, 2025

#include <iostream>
#include <string>
using namespace std;

// department class
class Department {

    // i saw no reason to make private variables
    public:

        string name;
        string chairperson;
        string chairemail;

        // default constructor
        Department(){};

        // overloaded contructor
        Department(string n, string cp, string ce) {

            name = n;
            chairperson = cp;
            chairemail = ce;

        }

};

class Employee{

    // i again see no reason for anything private
    public:
    string FirstName;
    string LastName;
    string PhoneNumber;
    string Email;
    Department department;

    // default constructor
    Employee(){};

    // overloaded constructor without email and department 
    Employee(string first, string last, string phone) {

        FirstName = first;
        LastName = last;
        PhoneNumber = phone;

    }

    // overloaded constructor with email and department 
    Employee(string first, string last, string phone, string email, Department dpmt) {

        FirstName = first;
        LastName = last;
        PhoneNumber = phone;
        Email = email;
        department = dpmt;

    }

    // destructor
    ~Employee(){};

};

int main() {

    // create the department
    Department HR("Human Resources", "Jordan Whitaker", "jordan.whitaker92@example.com");

    // create an employee
    Employee e("John", "Smith", "555-123-4567", "john.smith@example.com", HR);

    // print results
    cout << "Name: " << e.FirstName << " " << e.LastName << endl;
    cout << "Phone: " << e.PhoneNumber << endl;
    cout << "Email: " << e.Email << endl;

    cout << "\nDepartment:\n";
    cout << "Department Name: " << HR.name << endl;
    cout << "Chairperson Name: " << HR.chairperson << endl;
    cout << "Chairperson Email: " << HR.chairemail << endl;

}