import java.io.File;
import java.util.Scanner;

public class encryption {
    
    public static long encrypt(long card){

        String cardstr = String.valueOf(card);
        char[] cardDigitschar = cardstr.toCharArray();
        int[] cardDigits = new int[16];
        for (int i = 0; i < 16; i++) {
            cardDigits[i] = Character.getNumericValue(cardDigitschar[i]);
        }

        for(int i = 0; i < 16; i++){
            cardDigits[i] = (cardDigits[i] + 7) % 10;
        }

        int temp;
        for(int go4 = 0; go4 < 16; go4 += 4){
            
            temp = cardDigits[go4];
            cardDigits[go4] = cardDigits[go4 + 2];
            cardDigits[go4 + 2] = temp;

            temp = cardDigits[go4 + 1];
            cardDigits[go4 + 1] = cardDigits[go4 + 3];
            cardDigits[go4 + 3] = temp;
            
        }

        long result = 0;
        for (int digit : cardDigits) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) throws Exception{
        File file = new File("encryption.dat");
        Scanner scan = new Scanner(file);

        int numRuns = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numRuns; i++) {
            System.out.println(encrypt(scan.nextLong()));
            scan.nextLine();
        }
    }
}
