//Kyle Haynes
//10.3 Guided Practice: Writing to a File
//November 9th, 2025

#include <iostream>
#include <fstream>
using namespace std;

int main(){

    // create and open output file
    // i had to add the directory so it probably wont work on your machine
    ofstream outfile("C:\\Users\\fnafg\\Desktop\\compsci stuff\\my_stuff\\c++\\school\\output.txt");

    // error handling
    if (!outfile.is_open()){

        cerr << "error opening file" << endl;

        return 1;
    }

    // write to file
    outfile << "hello world! welcome to cosc-1436!" << endl;

    // close file
    outfile.close();

    // tell user we are done
    cout << "data written to output.txt successfully" << endl;

}