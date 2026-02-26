import java.io.File;
import java.util.Scanner;
public class MissionToMars {
    public static void main(String[] args) throws Exception {
        File file = new File("MissionToMars.dat");
        Scanner scan = new Scanner(file);

        int numRuns = scan.nextInt();
        for (int i = 0; i < numRuns; i++) {
            
            double distance = scan.nextDouble() * 1000000;
            double speed = scan.nextDouble();

            double totalHours = distance / speed;

            int days = (int) (totalHours / 24);
            double remainingHours = totalHours % 24;

            int hours = (int) remainingHours;
            double remainingMinutes = (remainingHours % 1) * 60;

            int minutes = (int) remainingMinutes;
            double remainingSeconds = (remainingMinutes % 1) * 60;

            int seconds = (int) Math.round(remainingSeconds);
            
            System.out.println("Time to Mars: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        }

    }
}
