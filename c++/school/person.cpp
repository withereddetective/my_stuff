//Kyle Haynes
//11.6 Performance Assessment: Create a Person Class
//November 16th, 2025

#include <iostream>
#include <string>
using namespace std;

// address class
class Address {

    // i saw no reason to make private variables
    public:

        string Address1;
        string Address2;
        string City;
        string State;
        string ZipCode;

        // default constructor
        Address(){};

        // overloaded contructor
        Address(string a1, string a2, string city, string state, string zip) {
            Address1 = a1;
            Address2 = a2;
            City = city;
            State = state;
            ZipCode = zip;
        }

};

class Person{

    // i again see no reason for anything private
    public:
    string FirstName;
    string LastName;
    string PhoneNumber;
    string Email;
    
    // addresses array
    Address Addresses[10];
    int AddressCount;

    // default constructor
    Person(){};

    // overloaded constructor
    Person(string first, string last, string phone, string email) {

        FirstName = first;
        LastName = last;
        PhoneNumber = phone;
        Email = email;
        AddressCount = 0;

    }

    // destructor
    ~Person() {

        // this wasn't handled automatically
        AddressCount = 0;

    }

    // method to add an address
    void AddAddress(Address addr) {

        if (AddressCount < 10) {

            Addresses[AddressCount] = addr;
            AddressCount++;

        } else {

            cout << "Address list is full. Cannot add more.\n";

        }

    }

};

int main() {

    // create a person
    Person p("John", "Smith", "555-123-4567", "john.smith@example.com");

    // create two addresses
    Address addr1("123 Main St", "Apt 4A", "New York", "NY", "10001");
    Address addr2("456 Oak Ave", "", "Albany", "NY", "12207");

    // add them to the person's address list
    p.AddAddress(addr1);
    p.AddAddress(addr2);

    // print results
    cout << "Name: " << p.FirstName << " " << p.LastName << endl;
    cout << "Phone: " << p.PhoneNumber << endl;
    cout << "Email: " << p.Email << endl;

    cout << "\nAddresses:\n";
    for (int i = 0; i < p.AddressCount; i++) {
        cout << "\nAddress #" << (i + 1) << endl;
        cout << "  Address1: " << p.Addresses[i].Address1 << endl;
        cout << "  Address2: " << p.Addresses[i].Address2 << endl;
        cout << "  City: " << p.Addresses[i].City << endl;
        cout << "  State: " << p.Addresses[i].State << endl;
        cout << "  ZipCode: " << p.Addresses[i].ZipCode << endl;
    }

}