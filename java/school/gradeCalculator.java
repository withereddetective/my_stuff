import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double hw1, hw2, hw3, hw4, hwAverage, quiz1, quiz2, quizAverage, finalExam, grade;
        String name;
        int minutes, hours;

        System.out.println("what is the course name?: ");
        name = scan.nextLine();

        System.out.println("how many average minutes did you work per week?: ");
        minutes = Integer.parseInt(scan.nextLine());
        hours = 0;
        while (minutes > 60){ 
            hours += 1;
            minutes -= 60;
        }

        System.out.println("for the next 4 lines, input your homework grades: ");
        hw1 = Double.parseDouble(scan.nextLine());
        hw2 = Double.parseDouble(scan.nextLine());
        hw3 = Double.parseDouble(scan.nextLine());
        hw4 = Double.parseDouble(scan.nextLine());
        hwAverage = (hw1 + hw2 + hw3 + hw4) / 4;

        System.out.println("for the next 2 lines, input your quiz grades: ");
        quiz1 = Double.parseDouble(scan.nextLine());
        quiz2 = Double.parseDouble(scan.nextLine());
        quizAverage = (quiz1 + quiz2) / 2;

        System.out.println("input your final exam grade: ");
        finalExam = Double.parseDouble(scan.nextLine());

        grade = Math.round((hwAverage * 0.35) + (quizAverage * 0.15) + (finalExam * 0.50));

        System.out.println("Course Name: " + name);
        System.out.println("Weekly Time Spent: " + hours + "h" + minutes + "m");
        System.out.println("Average Homework Grade: " + hwAverage);
        System.out.println("Average Quiz Grade: " + quizAverage);
        System.out.println("Final Exam Grade: " + finalExam);
        System.out.println("Overall Grade: " + grade);

        scan.close();
    }
}
