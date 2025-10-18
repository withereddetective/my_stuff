import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Equipment{

    int addedAttack = 0;
    int addedDefence = 0;
    int addedMagic = 0;
    double addedMoney = 0;
    String itemName = null;
    String description = null;
    String addedEffect = null;
    String[] partyMembers_who_can_equip;

    public Equipment(String name){

        itemName = name;

        switch (name) {
            case "bounce blade":
                
                addedAttack = 2;
                addedDefence = 1;

                description = "A pink saber with a rubber blade. Weak, but increases defence.";

                partyMembers_who_can_equip[0] = "kris";

                break;
            case "broken blade":
                
                description = "A rejected sword cut into 2 pieces. Not even you can equip this...";

                partyMembers_who_can_equip[0] = null;

                break;
            case "mecha saber":
                
                addedAttack = 4;

                description = "The blade extends when you press the hilt. CHA-CHK!";

                partyMembers_who_can_equip[0] = "kris";

                break;
            case "saber10":
                
                addedAttack = 6;

                description = "A saber made of 10 cactus needles. Fortunately, can deal more than 10 damage.";

                partyMembers_who_can_equip[0] = "kris";

                break;
            case "spookysword":
                
                addedAttack = 2;

                description = "A black-and-orange sword with a bat hilt.";

                partyMembers_who_can_equip[0] = "kris";

                break;
            case "winglade":
                
                addedAttack = 8;
                addedMoney = 0.05;

                description = "A majestic sword with a white feathered hilt. Slightly increases money won.";

                partyMembers_who_can_equip[0] = "kris";

                break;
            case "wood blade":
                
                addedAttack = 1;

                description = "A wooden practice blade with a carbon-reinforced core.";

                partyMembers_who_can_equip[0] = "kris";

                break;
            case "absorbax":
                
                addedAttack = 8;

                description = "A long, curved axe with an indent. Scoop up HP when you attack.";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "auto axe":
                
                addedAttack = 4;

                description = "Make sure to charge it by plugging it into the wall.";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "brave axe":
                
                addedAttack = 2;

                description = "A glossy ax from a block warrior. Suitable for heroes.";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "devils knife":
                
                addedAttack = 5;
                addedMagic = 4;
                addedEffect = "buster tp down";

                description = "Skull-emblazoned scythe-ax. Reduces Rudebuster's cost by 10";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "justice axe":
                
                addedAttack = 12;

                description = "It has no special powers. However, in order to attain this item, you became much stronger!";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "mane axe":
                
                description = "Beginner's ax forged from the mane of a dragon whelp.";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "toxic axe":
                
                addedAttack = 6;

                description = "An axe used to clear wastelands in a fetid swamp. Not poison but gross.";

                partyMembers_who_can_equip[0] = "susie";

                break;
            case "red scarf":
                
                description = "A basic scarf made of lightly magical fiber.";

                partyMembers_who_can_equip[0] = "ralsei";

                break;
            
            default:
                throw new AssertionError();
        }
    }
}

class partyMember {

    String name, armor1, armor2;
    Equipment weapon;
    int maxHealth, health, attack, defence, magic;

    public partyMember(String memberName){

        if (memberName.equals("kris")){

            name = "kris";
            //weapon = new Equipment("wood blade");
            armor1 = null;
            armor2 = null;
            maxHealth = 90;
            health = 90;
            attack = 10;
            defence = 2;
            magic = 0;

        } else if (memberName.equals("susie")){
        
            name = "susie";
            //weapon = new Equipment("mane axe");
            armor1 = null;
            armor2 = null;
            maxHealth = 110;
            health = 110;
            attack = 14;
            defence = 2;
            magic = 1;

        } else if (memberName.equals("ralsei")){
        
            name = "ralsei";
            //weapon = new Equipment("red scarf");
            armor1 = null;
            armor2 = null;
            maxHealth = 70;
            health = 70;
            attack = 8;
            defence = 2;
            magic = 7;

        } else {

            throw new AssertionError();

        }
    }
}

public class realRPG_battleSystem {

    public static int userChoice(String question){
        Scanner scan = new Scanner(System.in);

        System.out.println(question);
        System.out.print("Choice: ");
        return scan.nextInt();

    }

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

    public static double fight(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("press enter to begin the attack");
        scanner.nextLine();

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
                    System.out.println("critical hit\n");
                    return 15.0;
                } else {
                    return elapsed / 10;
                }
            }

            System.out.print(elapsed);
            try {
                Thread.sleep(1); // Print every millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\b\b\b");
        }

        if (inputTime[0] == -1) {
            System.out.println("missed\n");
            return 0.0;
        }

        scanner.close();
        return 0;
    }

    public static void battle(partyMember partyMember1, partyMember partyMember2, partyMember partyMember3){

        String enemyName = "test_enemy";
        int enemyAtk = 5;
        int enemyDef = 4;
        int enemyHealth = 1000;
        int enemyMercy = 0;

        int tp = 0;

        String krisSpriteName = "kris_default";
        String susieSpriteName = "susie_default";
        String ralseiSpriteName = "ralsei_default";

        String kris_decision = null;
        String susie_decision = null;
        String ralsei_decision = null;

        print_battle_sprite(krisSpriteName);
        print_battle_sprite(susieSpriteName);
        print_battle_sprite(ralseiSpriteName);
        boolean userCorrectDecision = true;
        
        if (partyMember1.health > 0){
            while (userCorrectDecision){
                int userDecision = userChoice("Do you want kris to fight(1), act(2), item(3), mercy(4), or defend(5)?: ");
                switch (userDecision){

                    case 1:
                        kris_decision = "fight";
                        krisSpriteName = "kris_attack";
                        userCorrectDecision = false;
                        break;
                    case 2:
                        System.out.println("i do not have that implemented yet.");
                    case 3:
                        System.out.println("i do not have that implemented yet.");
                    case 4:
                        kris_decision = "spare";
                        krisSpriteName = "kris_act";
                        userCorrectDecision = false;
                        break;
                    case 5:
                        kris_decision = "defend";
                        krisSpriteName = "kris_defend";
                        userCorrectDecision = false;
                        break;
                    default:
                        System.out.println("incorrect input");

                }
            }
        } else {
            krisSpriteName = "kris_downed";
        }

        print_battle_sprite(krisSpriteName);
        print_battle_sprite(susieSpriteName);
        print_battle_sprite(ralseiSpriteName);
        userCorrectDecision = true;
        
        if (partyMember2.health > 0){
            while (userCorrectDecision){
                switch (userChoice("Do you want susie to fight(1), act(2), item(3), mercy(4), or defend(5)?: ")){

                    case 1:
                        susie_decision = "fight";
                        susieSpriteName = "susie_attack";
                        userCorrectDecision = false;
                        break;
                    case 2:
                        System.out.println("i do not have that implemented yet.");
                    case 3:
                        System.out.println("i do not have that implemented yet.");
                    case 4:
                        susie_decision = "spare";
                        susieSpriteName = "susie_act";
                        userCorrectDecision = false;
                        break;
                    case 5:
                        susie_decision = "defend";
                        susieSpriteName = "susie_defend";
                        userCorrectDecision = false;
                        break;
                    default:
                        System.out.println("incorrect input");

                }
            }
        } else {
            susieSpriteName = "susie_downed";
        }

    }

    public static void main(String[] args) {
        partyMember kris = new partyMember("kris");
        partyMember susie = new partyMember("susie");
        partyMember ralsei = new partyMember("ralsei");
        battle(kris, susie, ralsei);
    }
}
