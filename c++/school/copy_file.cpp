//Kyle Haynes
//10.5 Performance Assessment: Copy File Contents
//November 9th, 2025

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(){

    // declare
    string reading_filename = "C:\\Users\\fnafg\\Desktop\\compsci stuff\\my_stuff\\c++\\school\\reading_file.txt";

    // open the file for reading
    ifstream file(reading_filename.c_str());

    // create file for writing
    ofstream outfile("C:\\Users\\fnafg\\Desktop\\compsci stuff\\my_stuff\\c++\\school\\writing_file.txt");

    // error handling for writing
    if (!outfile.is_open()){

        cerr << "error opening writing file" << endl;

        return 1;
    }

    // verification and error handling for reading
    if (file.is_open()){

        string line;

        cout << "success in opening file" << endl;

        // read file
        while (getline(file, line)){
            // write file
            outfile << line << endl;
        }
        cout << "success in writing file" << endl;

        // close files
        file.close();
        outfile.close();

    } else {
        cerr << "error opening reading file" << endl;
    }

}