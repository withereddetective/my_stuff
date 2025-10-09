import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class realRPG_battleSystem {
    private static volatile String input = null; // Use volatile for thread visibility

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeoutMilliseconds = 5000; // 5 seconds

        System.out.println("Please enter something within " + timeoutMilliseconds / 1000 + " seconds:");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (input == null) { // If no input received yet
                    System.out.println("\nTime's up! No input received.");
                    // You might want to close the scanner here or signal the main thread to proceed
                }
            }
        }, timeoutMilliseconds);

        // Start a new thread to read input, as scanner.nextLine() is blocking
        Thread inputThread = new Thread(() -> {
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
            }
        });
        inputThread.start();

        try {
            inputThread.join(timeoutMilliseconds + 100); // Wait for the input thread to finish or timeout
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        timer.cancel(); // Cancel the timer if input was received in time

        if (input != null) {
            System.out.println("You entered: " + input);
        } else {
            System.out.println("Program continues without input.");
        }

        scanner.close();
    }
}
