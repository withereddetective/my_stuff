import java.util.Scanner;
public class weirdPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("gimme word: ");
        String userInput = scan.nextLine();

        for (int i = 1; i <= userInput.length(); i++) {
            
            if (i % 3 != 0){

                System.out.print(userInput.charAt(i - 1));

            }

        }

    }
}
