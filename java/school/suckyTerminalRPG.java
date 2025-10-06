import java.util.Scanner;
public class suckyTerminalRPG {

    public boolean userDecision(String question, Scanner scan){

        String decision;
        System.out.println(question);
        System.out.print("Choice: ");

        try{
            decision = scan.next();
            if (decision.equals("1") || decision.toUpperCase().equals("ONE")){
                return true;
            } else if (decision.equals("2") || decision.toUpperCase().equals("TWO")){
                return false;
            } else {
                throw new IllegalArgumentException("bruh");
            }
        } catch (RuntimeException e){
            System.out.println("thats not a valid option you bozo");
            System.out.println("you get decision 1 for that.");
        } catch (Exception a) {
            System.out.println("you managed to make an unknown error. how.");
            System.out.println("you get decision 1 for that.");
        } finally {
            return true;
        }
    }

    public void printCurrentStats(int health, int gold){

        System.out.println("Current stats: Health = " + health + ", Gold = " + gold);
        System.out.println("");

    }

    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int health = 10;
        int gold = 0;

        System.out.println("Welcome to the RPG!");
        System.out.print("Enter your hero's name: ");
        name = scan.next();
        System.out.println("");
        System.out.println("Hello, " + name + ". You start with 10 health and 0 gold.");
        System.out.println("");

        boolean decision1 = userDecision("You see two paths. Do you go into the forest (1) or the cave (2)?", scan);
        if (decision1){
            System.out.println("You enter the forest and find a treasure chest. +5 gold!");
            gold += 5;
        } else {
            System.out.println("You enter the cave and rest up. +5 health!");
            health += 5;
        }
        printCurrentStats(health, gold);

        boolean weapon_have = false;
        boolean decision2 = userDecision("You come across a shop. Do you buy a weapon (1) or not (2)?", scan);
        if (decision1 && gold == 5){
            System.out.println("You buy the weapon.");
            gold -= 5;
            weapon_have = true;
        } else if(decision1) {
            System.out.println("You don't have enough money!");
        } else {
            System.out.println("You don't buy anything.");
        }
        printCurrentStats(health, gold);

    }
}