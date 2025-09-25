import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Madlibs!");

        System.out.println("Input a name: ");
        String ansName = scan.nextLine();

        System.out.println("Input an adjective: ");
        String ansAdjective = scan.nextLine();

        System.out.println("Input an animal: ");
        String ansAnimal = scan.nextLine();

        System.out.println("Input a place: ");
        String ansPlace = scan.nextLine();

        System.out.println("Input a verb ending in '-ing': ");
        String ansIng = scan.nextLine();

        System.out.println("Input a silly word: ");
        String ansSilly = scan.nextLine();

        System.out.println("Input a type of food: ");
        String ansFood = scan.nextLine();

        System.out.println("Input a number: ");
        String ansNumber = scan.nextLine();

        System.out.println("Input an exclamation: ");
        String ansExclamation = scan.nextLine();

        System.out.println("Input an item youd find in a backpack: ");
        String ansBackpack = scan.nextLine();

        System.out.println("");
        System.out.println("Ready for your story? Here it is!");
        System.out.println("");




        System.out.println("One blue morning, " + ansName + " woke up feeling unusually adventurous. They grabbed " + ansBackpack + " from their backpack—just in case—and set off toward " + ansPlace + " with nothing but a backpack full of " + ansFood + " and dreams of glory.");
        System.out.println("As they were " + ansIng + " in the maple-scented forests, a wild " + ansAnimal + " appeared wearing sunglasses and humming the national anthem. '" + ansExclamation + "!' shouted " + ansName + ", startled by the creatures swagger.");
        System.out.println("The " + ansAnimal + " paused, sniffed the air, and whispered, 'You smell like " + ansSilly + "' Then, without warning, it darted off into the trees.");
        System.out.println("Determined to catch it, " + ansName + " counted to " + ansNumber + ", did a backflip, and yelled the ancient word of summoning: '" + ansSilly + "!' Suddenly, the forest lit up with sparkles, and a portal opened to a dimension made entirely of " + ansFood + ".");
        System.out.println("Inside, the " + ansAnimal + " was waiting. 'You passed the test,' it said. 'Now take this " + ansBackpack + " and write your destiny.'");
        System.out.println("And thats how " + ansName + " became the legendary " + ansAnimal + " whisperer of " + ansPlace + ", known far and wide for his " + ansAdjective + " aura and his uncanny ability to summon woodland creatures with " + ansSilly + ".");

        scan.close();
    }
}
