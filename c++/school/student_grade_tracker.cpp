//Kyle Haynes
//16.1 Project 2 - Student Grade Tracker
//December 17th, 2025

#include <iostream>
#include <string>
#include <limits>
using namespace std;

class Student{

    private:

        string name;
        int grades[5];
        bool gradesEntered = false;

    public:

        // constructor
        Student(string studentName){
            name = studentName;
        }

        void inputGrades(){
            cout << "\nEnter grades for " << name << " (5 grades): " << endl;
            for(int i = 0; i < 5; i++){
                cin >> grades[i];
                // exception handling for invalid input
                if (cin.fail()) {
                    cin.clear();
                    cin.ignore(numeric_limits<streamsize>::max(), '\n');
                    cout << "Invalid input. Please enter a valid input." << endl;
                } else if (grades[i] < 0 || grades[i] > 100) {
                    cout << "Grade must be between 0 and 100. Please re-enter." << endl;
                    i--; // decrement i to repeat this iteration
                }
            }
            gradesEntered = true;
        }

        double calculateAverage(){
            
            // exception handling for no grades entered
            if (!gradesEntered) {
                cout << "Grades have not been entered yet." << endl;
                return 0.0;
            }
            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum += grades[i];
            }
            return sum / 5;
        }

        char getLetterGrade(){

            // exception handling for no grades entered
            if (!gradesEntered) {
                cout << "Grades have not been entered yet." << endl;
                return 'N'; // N for Not available
            }

            int avg = static_cast<int>(calculateAverage());

            switch (avg / 10) {
                case 10:
                    return 'A';
                    break;
                case 9:
                    return 'A';
                    break;
                case 8:
                    return 'B';
                    break;
                case 7:
                    return 'C';
                    break;
                case 6:
                    return 'D';
                    break;
                default:
                    return 'F';
                    break;
            }
        }

        string getName(){
            return name;
        }

};

int main(){

    cout << "Input the Student's Name: ";
    cin >> ws; // to consume any leading whitespace
    string studentName;
    getline(cin, studentName);
    Student student(studentName);

    int decision;
    do{

        cout << "\nMenu:\n1. Input Grades\n2. View Average\n3. View Letter Grade\n4. Exit\nEnter your choice: ";
        cin >> decision;

        // exception handling for invalid menu choice input
        if (cin.fail()) {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }

        switch(decision){
            case 1:
                student.inputGrades();
                break;
            case 2:
                cout << "\nAverage grade for " << student.getName() << ": " << student.calculateAverage() << endl;
                break;
            case 3:
                cout << "\nLetter grade for " << student.getName() << ": " << student.getLetterGrade() << endl;
                break;
            case 4:
                cout << "\nExiting program." << endl;
                break;
            default:
                cout << "Invalid choice. Please try again." << endl;
                break;
        }

    } while (decision != 4);

    return 0;
}