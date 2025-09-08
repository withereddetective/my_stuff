import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println(" ");
        System.out.println("first task:");
        System.out.println(" ");

        System.out.println("What is your name?: ");
        String name = scan.nextLine();
        System.out.println("What is your favorite animal?: ");
        String animal = scan.nextLine();
        System.out.println("Hello " + name + ". Your favorite animal is the " + animal + ".");


        System.out.println(" ");
        System.out.println("second task:");
        System.out.println(" ");

        System.out.println("Give me a number: ");
        String number = scan.nextLine();
        for (int i = 0; i < 3; i++) {
            System.err.println(number);
        }


        System.out.println(" ");
        System.out.println("third task:");
        System.out.println(" ");

        System.out.println("The next 3 lines should be your 3 test scores as integers.");
        int test_score_1 = Integer.parseInt(scan.nextLine());
        int test_score_2 = Integer.parseInt(scan.nextLine());
        int test_score_3 = Integer.parseInt(scan.nextLine());
        int test_average = (test_score_1 + test_score_2 + test_score_3) / 3;
        System.out.println(test_average);


        System.out.println(" ");
        System.out.println("fourth task:");
        System.out.println(" ");

        System.out.println("The next 3 lines should be each one word.");
        String word1 = (scan.nextLine());
        String word2 = (scan.nextLine());
        String word3 = (scan.nextLine());
        System.out.println(word3 + " " + word2 + " " + word1);


        System.out.println(" ");
        System.out.println("fifth task:");
        System.out.println(" ");

        System.out.println("What is your length?: ");
        int length = Integer.parseInt(scan.nextLine());
        System.out.println("What is your width?: ");
        int width = Integer.parseInt(scan.nextLine());
        System.out.println("  " + length + "  ");
        System.out.println(" ___");
        System.out.println("|   |");
        System.out.println("|   | " + width);
        System.out.println("|___|");
        System.out.println("");
        int area = length * width;
        System.out.println("Area = " + area);

        scan.close();
    }
}