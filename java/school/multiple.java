import java.io.File;
import java.util.Scanner;
public class multiple {

    public static int[] getDigits(String allDigits){

        String[] seperatedDigits = allDigits.split("");
        int[] returnedDigits = new int[seperatedDigits.length];
        for (int i = 0; i < seperatedDigits.length; i++){
            returnedDigits[i] = Integer.parseInt(seperatedDigits[i]);
        }
        return returnedDigits;

    }

    public static boolean compareDigits(int num, int[] digits){

        int[] numDigits = getDigits(Integer.toString(num));
        for (int digit : numDigits) {
            for (int digit2 : digits) {
                if (digit == digit2) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) throws Exception{
        File file = new File("multiple.dat");
        Scanner scan = new Scanner(file);

        int numRuns = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numRuns; i++) {
        
            int num = scan.nextInt();
            int[] digits = getDigits(scan.next());

            int multiplier = 2;
            while (true){

                if (compareDigits(num * multiplier, digits)){
                    System.out.println(num * multiplier);
                    break;
                }
                multiplier++;

            }
        }
    }
}