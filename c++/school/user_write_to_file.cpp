//Kyle Haynes
//10.3 Guided Practice: Writing to a File
//November 9th, 2025

#include <iostream>
#include <fstream>
using namespace std;

int main(){

    // create and open output file
    ofstream outfile("C:\\Users\\fnafg\\Desktop\\compsci stuff\\my_stuff\\c++\\school\\user_output.txt");

    // error handling
    if (!outfile.is_open()){

        cerr << "error opening file" << endl;

        return 1;
    }

    // getting user input
    string user_input;
    cout << "what do you want to write to the file?:" << endl;
    getline(cin, user_input);

    // write to file and close file
    outfile << user_input;
    outfile.close();
    cout << "successfully wrote to file" << endl;

    // reopen file
    ofstream outfile_append("C:\\Users\\fnafg\\Desktop\\compsci stuff\\my_stuff\\c++\\school\\user_output.txt", ios::app);

    // error handling
    if (!outfile_append.is_open()) {
        cerr << "error opening file" << endl;
        return 1;
    }

    // getting user input
    cout << "what do you want to write to the end of the file?:" << endl;
    getline(cin, user_input);
    if (user_input.empty()) {
        getline(cin, user_input);
    }

    // write to file and close file
    outfile_append << user_input;
    outfile_append.close();
    cout << "successfully wrote to file again" << endl;

    return 0;

}