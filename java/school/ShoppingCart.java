import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double applePrice = 0.50;
        double bananaPrice = 0.75;

        System.out.println("How many apples do you want?: ");
        double appleNumber = Integer.parseInt(scan.nextLine());

        System.out.println("How many bananas do you want?: ");
        double bananaNumber = Integer.parseInt(scan.nextLine());

        double total = (appleNumber * applePrice) + (bananaNumber * bananaPrice);
        boolean discount = false;
        if (total > 10) {
            total *= 0.9;
            discount = true;
        }

        System.out.println("Here is your reciept:");
        System.out.println(appleNumber + " apples - $" + (appleNumber * applePrice));
        System.out.println(bananaNumber + " bananas - $" + (bananaNumber * bananaPrice));
        System.out.println("total cost - $" + total);
        if (discount) {
            System.out.println("you recieved a 10% discount for spending over $10, have a good day!");
        } else {
            System.out.println("did you know that you could recieve a 10% discount for spending over $10 on your next purchase? have a good day!");
        }
        
        scan.close();
    }
}
