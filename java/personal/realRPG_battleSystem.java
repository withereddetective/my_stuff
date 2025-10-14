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
            case "ralseiCh1_default":
                
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
            case "ralseiCh1_attack":
                
                first_line = 316;
                last_line = 348;

                break;
            case "ralsei_attack":
                
                first_line = 350;
                last_line = 378;

                break;
            case "kris_act":
                
                first_line = 380;
                last_line = 414;

                break;
            case "susie_act":
                
                first_line = 416;
                last_line = 456;

                break;
            case "susie_rudeBuster":
                
                first_line = 458;
                last_line = 517;

                break;
            case "susie_heal":
                
                first_line = 519;
                last_line = 560;

                break;
            case "ralseiCh1_pacify":
                
                first_line = 562;
                last_line = 606;

                break;
            case "ralsei_pacify":
                
                first_line = 608;
                last_line = 646;

                break;
            case "ralseiCh1_healPrayer":
                
                first_line = 648;
                last_line = 679;

                break;
            case "ralsei_healPrayer":
                
                first_line = 681;
                last_line = 712;

                break;
            case "kris_item":
                
                first_line = 714;
                last_line = 759;

                break;
            case "susie_item":
                
                first_line = 761;
                last_line = 804;

                break;
            case "ralseiCh1_item":
                
                first_line = 806;
                last_line = 838;

                break;
            case "ralsei_item":
                
                first_line = 840;
                last_line = 870;

                break;
            case "kris_defend":
                
                first_line = 872;
                last_line = 906;

                break;
            case "susie_defend":
                
                first_line = 908;
                last_line = 958;

                break;
            case "ralseiCh1_defend":
                
                first_line = 960;
                last_line = 1000;

                break;
            case "ralsei_defend":
                
                first_line = 1002;
                last_line = 1040;

                break;
            default:
                throw new AssertionError();
        }

        try (Scanner fileScanner = new Scanner(spriteFile)){

            int lineNumber = 0;

            while (fileScanner.hasNextLine()){
                lineNumber++;
                String line = fileScanner.nextLine();

                if (lineNumber >= first_line && lineNumber <= last_line){
                    System.out.println(line);
                }

            }

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
        print_battle_sprite("susie_default");
        fight_test();
    }
}
