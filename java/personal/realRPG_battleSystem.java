import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class realRPG_battleSystem {

    public static void print_battle_sprite(String sprite_name){

        File spriteFile = new File("java/personal/battle_sprites.txt");
        int first_line = 0;
        int last_line = 0;

        switch (sprite_name) {
            case "kris_default":

                first_line = 1;
                last_line = 29;

                break;
            case "susie_default":
                
                first_line = 31;
                last_line = 67;

                break;
            case "ralsei_hidden_default":
                
                first_line = 69;
                last_line = 108;

                break;
            case "ralsei_default":
                
                first_line = 110;
                last_line = 145;

                break;
            case "kris_downed":
                
                first_line = 147;
                last_line = 172;

                break;
            case "susie_downed":
                
                first_line = 174;
                last_line = 218;

                break;
            case "ralsei_downed":
                
                first_line = 220;
                last_line = 237;

                break;
            case "kris_attack":
                
                first_line = 239;
                last_line = 280;

                break;
            case "susie_attack":
                
                first_line = 282;
                last_line = 314;

                break;
            case "ralsei_hidden_attack":
                
                first_line = 316;
                last_line = 348;

                break;
            case "ralsei_attack":
                
                first_line = 350;
                last_line = 378;

                break;
            default:
                throw new AssertionError();
        }

        try (Scanner fileScanner = new Scanner(spriteFile)){

            int lineNumber = 0;

            while (fileScanner.hasNextLine()){
                lineNumber++;
                String line = fileScanner.nextLine();

                if (lineNumber >= first_line || lineNumber <= last_line){
                    System.out.println(line);
                }

            }

            fileScanner.close();

        } catch (FileNotFoundException e) {

            System.err.println("Error: File not found - " + e.getMessage());

        }

    }

    public static void fight_test(){
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

    public static void main(String[] args) {
        print_battle_sprite("kris_default");
    }
}
