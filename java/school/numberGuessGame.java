import java.util.Random;
import java.util.Scanner;

public class numberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userInput;
        int guesses = 0;

        do {
            System.out.print("guess a number between 1 and 100: ");
            userInput = scanner.nextInt();
            guesses += 1;

            if (guesses > 9){

                System.out.println("game over. the number was " + randomNumber);
                break;

            } else {

                if (userInput == randomNumber) {
                    System.out.println("correct.");
                    System.out.println("you took " + guesses + " attempts");
                } else if (userInput > randomNumber) {
                    System.out.println("too high!");
                    System.out.println("you have " + (10 - guesses) + " guesses left");
                } else {
                    System.out.println("too low!");
                    System.out.println("you have " + (10 - guesses) + " guesses left");
                }

            }
        } while (userInput != randomNumber);

        scanner.close();
    }
}