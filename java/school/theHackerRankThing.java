import java.util.Scanner;
public class theHackerRankThing {

    public static boolean isInteger(String str) {
        // i googles if java had a string method for this and gemini gave me this so oop
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    

    public static void shrek(){

        System.out.println("________________   ________________   ");
        System.out.println("\\_____  \\   _   \\  \\_____  \\   _   \\");
        System.out.println(" /  ____/  /_\\   \\  /  ____/  /_\\   \\");
        System.out.println("/       \\  \\_/    \\/       \\  \\_/    \\");
        System.out.println("\\_______ \\_____   /\\_______ \\_____   /");

    }

    public static void farquaad(){

        System.out.println("That champion shall have the honor -");
        System.out.println("-no, no -- the privelage to go forth");
        System.out.println("and rescue the lovely Princess Fiona");
        System.out.println("from the fiery keep of the dragon. If");
        System.out.println("for any reason the winner is unsuccessful,");
        System.out.println("the first runner up will take his place");
        System.out.println("and so on and so forth. Some of you");
        System.out.println("may die, but it's a sacrifice I am willing");
        System.out.println("to make. (cheers) Let the tournament begin!");

    }

    public static void lineSquatters(){
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");

        int sum = 0;

        while (scan.hasNext()){
            while (scan.hasNext()){

                String current_value = scan.next();

                if (isInteger(current_value)){

                    int x = Integer.parseInt(current_value);
                    sum += x;

                }

            }

            scan.nextLine();
            System.out.println("SQUATTER SUM = " + sum);
            sum = 0;
        }
    }

    public static void magic(){
        Scanner scan = new Scanner(System.in);

        int a, b, c, d, e;
        int counter = scan.nextInt();
        for (int i = 0; i < counter; i++) {
            
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
            e = scan.nextInt();
            scan.nextLine();

            int result = ((a + b) * (c + d)) / e;
            System.out.println(result);

        }

    }

    public static void main(String[] args) {
        
        

    }
}
