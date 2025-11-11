//Kyle Haynes
//10.4 Guided Practice: Reading From a File
//November 9th, 2025

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(){

    // declare
    string path = "C:\\Users\\fnafg\\Desktop\\compsci stuff\\my_stuff\\c++\\school\\";
    string filename, filepath;

    // ask user for filename
    cout << "enter file to read:" << endl;
    cin >> filename;

    // add filename to path
    filepath = path + filename;

    // open the file for reading
    ifstream file(filepath.c_str());

    // verification and error handling
    if (file.is_open()){

        string line;

        // read file
        while (getline(file, line)){
            cout << line << endl;
        }

        // close file
        file.close();

    } else {
        cerr << "error opening file" << endl;
    }

}