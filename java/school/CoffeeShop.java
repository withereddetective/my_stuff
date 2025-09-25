import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double coffeePrice = 2.50;
        double pastryPrice = 3.00;

        System.out.println("How many coffees do you want?: ");
        double coffeeNumber = Integer.parseInt(scan.nextLine());

        System.out.println("How many pastries do you want?: ");
        double pastryNumber = Integer.parseInt(scan.nextLine());

        double subtotal = (coffeeNumber * coffeePrice) + (pastryNumber * pastryPrice);
        double total = subtotal * 1.08;

        System.out.println("What is your tip? (put it as a positive integer and do not put the % symbol): ");
        double tip = Integer.parseInt(scan.nextLine());
        double finalTotal = total + ((subtotal / 100) * tip);

        System.out.println("Here is your reciept:");
        System.out.println(coffeeNumber + " coffees - $" + (coffeeNumber * coffeePrice));
        System.out.println(pastryNumber + " pastries - $" + (pastryNumber * pastryPrice));
        System.out.println("subtotal - $" + subtotal);
        System.out.println("tip - $" + tip);
        System.out.println("total - $" + finalTotal);

        scan.close();
    }
}