import java.util.Scanner;
public class dice {

    public static int roll(){

        int the_roll = (int) ((Math.random() * 6) + 0.5);
        the_roll = (the_roll == 0) ? 6 : the_roll;
        return the_roll;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("how many rolls?: ");
        int amount_of_rolls = scan.nextInt();
        int[] rolls = new int[amount_of_rolls];
        double rolls_avg = 0;

        for (int i = 0; i < amount_of_rolls; i++) {
            rolls[i] = roll();
            rolls_avg += rolls[i];
        }
        rolls_avg /= amount_of_rolls;

        System.out.println("\nthe average roll is " + rolls_avg);

        scan.close();
    }
}
