import java.util.Scanner;

public class realRPG_battleSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long[] inputTime = { -1 };

        Thread inputThread = new Thread(() -> {
            scanner.nextLine(); // Waits for any input
            inputTime[0] = System.currentTimeMillis();
        });

        inputThread.start();

        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1000) {
            long elapsed = System.currentTimeMillis() - startTime;

            if (inputTime[0] != -1) {
                if (elapsed >= 950) {
                    System.out.println("critical hit");
                } else {
                    System.out.println("you have a damage multiplier of " + elapsed);
                }
                break;
            }

            System.out.println(elapsed);
            try {
                Thread.sleep(1); // Print every millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (inputTime[0] == -1) {
            System.out.println("missed");
        }

        scanner.close();
    }
}
