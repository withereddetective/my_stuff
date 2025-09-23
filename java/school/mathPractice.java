import java.util.Scanner;
public class mathPractice {

    public static int largerNumber(int a, int b){
        
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // printing square root
        System.out.print("give me num: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("\n" + Math.sqrt(num));


        // print larger of 2 numbers
        System.out.println("in the next 2 lines, give me a number for each line: ");
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(largerNumber(a, b));


        // generate dice roll
        int x = (int) (Math.random() * 6) + 1;
        System.out.println("your dice roll is: " + x);

    }
}
