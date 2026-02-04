import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
public class Degree {

    public static int[] scan_for_int_array(Scanner scan){
        LinkedList<Integer> arr = new LinkedList<>();
        String line = scan.nextLine();
        Scanner linescan = new Scanner(line);
        while (linescan.hasNext()){ arr.add(linescan.nextInt()); }
        return arr.stream().mapToInt(i -> i).toArray();
    }

    public static int get_degree(int[] arr){
        int degree = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            for (int subindex = index + 1; subindex < arr.length; subindex++) {
                degree = (arr[index] > arr[subindex]) ? degree + 1 : degree;
            }
        }
        return degree;
    }

    public static void main(String[] args) throws Exception{
        File file = new File("degree.dat");
        Scanner scan = new Scanner(file);

        int numRuns = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numRuns; i++) { System.out.println(get_degree(scan_for_int_array(scan))); }
    }
}
