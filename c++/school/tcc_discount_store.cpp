//Kyle Haynes
//15.1 Project 1 - TCC Discount Store
//December 17th, 2025

#include <iostream>
#include <string>
#include <limits>
#include <cmath>
using namespace std;

class Product{

    private:
        string name;
        double price;
        bool isDiscounted;

    public:

        // default constructor
        Product(){
            name = "";
            price = 0.0;
            isDiscounted = false;
        }

        // constructor
        Product(string prodName, double prodPrice){
            name = prodName;
            price = prodPrice;
            isDiscounted = false;
        }

        void inputProductName(){
            string name;
            cout << "Enter the product name: ";

            // exception handling for invalid input
            try{
                getline(cin, name);
                cin.ignore(numeric_limits<streamsize>::max(), '\n'); // clear input buffer
            } catch(...){
                cout << "Invalid input. Please enter a valid product name." << endl;
            }

            this->name = name;
        }

        void inputProductPrice(){
            double price;
            cout << "Enter the product price: $";

            // exception handling for invalid input
            cin >> price;
            if (cin.fail()) {
                cin.clear();
                cin.ignore(numeric_limits<streamsize>::max(), '\n');
                cout << "Invalid input. Please enter a valid product price." << endl;
            }

            // round to 2 decimal places
            price = round(price * 100) / 100;

            this->price = price;
        }

        string getName(){
            return name;
        }

        double getPrice(){
            return price;
        }

        void applyDiscount(double discountPercent){

            // exception handling for invalid discount percent
            if (discountPercent < 0 || discountPercent > 100){
                throw invalid_argument("Discount percent must be between 0 and 100.");
            }
            
            if(!isDiscounted){
                price *= (1 - discountPercent / 100);
                isDiscounted = true;
            }
        }

};

double findSumOfDoubleArray(double arr[], int size){
    double sum = 0;
    for(int i = 0; i < size; i++){
        sum += arr[i];
    }
    return sum;
}

int main(){

    cout << "Welcome to TCC Discount Store!" << endl;
    cout << "A 10% discount will be applied to any purchase over $100." << endl;

    cout << "how many products would you like to enter?: ";
    int numProducts;
    cin >> numProducts;
    if (cin.fail()) {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input. Please enter a valid number of products." << endl;
        return 1;
    }

    // declare arrays to store product details
    Product products[numProducts];
    double productPrices[numProducts];

    // input product details
    for(int i = 0; i < numProducts; i++){
        cout << "\nProduct " << (i + 1) << ":" << endl;
        Product tempProd; // temporary Product object to use input methods
        tempProd.inputProductName();
        tempProd.inputProductPrice();

        // store object in array
        products[i] = tempProd;

        // store price in double array for sum calculation
        productPrices[i] = tempProd.getPrice();

    }

    // apply discount if applicable
    if (findSumOfDoubleArray(productPrices, numProducts) > 100) {
        
        // apply discount in array
        for (int i = 0; i < numProducts; i++) {
            productPrices[i] *= 0.9; // Apply 10% discount
        }

        // apply discount in Product objects
        for (auto &prod : products) {
            prod.applyDiscount(10); // Apply 10% discount
        }

        cout << "\nA 10% discount has been applied to your purchase!" << endl;
    }

    // display final product details
    cout << "\nFinal Product Details:" << endl;
    for(int i = 0; i < numProducts; i++){
        cout << "Product " << (i + 1) << ": " << products[i].getName() << " - Price: $" << products[i].getPrice() << endl;
    }
    cout << "Total Price: $" << findSumOfDoubleArray(productPrices, numProducts) << endl;

    return 0;
}