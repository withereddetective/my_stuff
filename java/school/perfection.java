import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class perfection {

    public static int[] getFactors(int num){

        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.ceil(num / 2); i++) {
            if (num % i == 0){
                factors.add(i);
            }
        }

        int[] factorsarray = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            factorsarray[i] = factors.get(i);
        }

        return factorsarray;

    }

    public static int getSumOfArray(int[] arr){

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;

    }

    public static void main(String[] args) throws Exception{
        File file = new File("perfection.dat");
        Scanner scan = new Scanner(file);

        int numRuns = scan.nextInt();
        
        for (int i = 0; i < numRuns; i++) {
            int num = scan.nextInt();
            System.out.println((getSumOfArray(getFactors(num)) == num) ? "PERFECT" : (getSumOfArray(getFactors(num)) < num) ? "DEFICIENT" : "ABUNDANT");
        }
    }
}
