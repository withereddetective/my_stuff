//Kyle Haynes
//11.5 Guided Practice: Constructors and Destructors
//November 16th, 2025

#include <iostream>
#include <string>
using namespace std;

class FileCabinet{

    private:

        // property
        int totalNumOfFiles;

    public:

        // properties
        int numOfDrawers;
        int numOfFilesPerDrawer;
        bool isLockable;


        // constructors

        // default
        FileCabinet(){};

        // overloaded
        FileCabinet(int drawers, int filesPerDrawer, bool lockable){

            numOfDrawers = drawers;
            numOfFilesPerDrawer = filesPerDrawer;
            isLockable = lockable;
            setTotalNumOfFiles();

        }


        // destructor
        ~FileCabinet(){};


        // methods

        // setter
        void setTotalNumOfFiles(){

            totalNumOfFiles = numOfDrawers * numOfFilesPerDrawer;

        };

        // getter
        int getTotalNumOfFiles(){

            return totalNumOfFiles;

        };

};

// main program
int main(){

    FileCabinet fileCabinet1;

    fileCabinet1.numOfDrawers = 4;
    fileCabinet1.numOfFilesPerDrawer = 50; fileCabinet1.isLockable = true;
    fileCabinet1.setTotalNumOfFiles();

    //print out values for cabinet 1
    cout << "(Cabinet 1) Number of drawers: " << fileCabinet1.numOfDrawers << endl;
    cout << "(Cabinet 1) Number of files per drawer: " << fileCabinet1.numOfFilesPerDrawer << endl;
    cout << "(Cabinet 1) Total number of files the cabinet can hold: " << fileCabinet1.getTotalNumOfFiles() << endl;

    // instance with constructor
    FileCabinet fileCabinet2(5, 300, false);

    // print out values for cabinet 2
    cout << "(Cabinet 2) Number of drawers: " << fileCabinet2.numOfDrawers << endl;
    cout << "(Cabinet 2) Number of files per drawer: " << fileCabinet2.numOfFilesPerDrawer << endl;
    cout << "(Cabinet 2) Total number of files the cabinet can hold:"<<fileCabinet2.getTotalNumOfFiles() << endl;
    
}