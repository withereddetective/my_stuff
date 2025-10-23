import java.util.Scanner;
public class printTo50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("give me number between 0 and 50: ");
        try {
            
            int userInput = scan.nextInt();
            scan.nextLine();

            if (userInput < 0 || userInput > 50){

                throw new RuntimeException("invalid number");

            }

            int num = userInput;
            for (int row = num; row < 51; row+= 5) {
                for (int col = 0; col < 5; col++) {
                    
                    if (num == 51){
                        break;
                    }

                    System.out.print(num + " ");
                    num++;

                }
                System.out.print("\n");
            }

        } catch (RuntimeException e) {
            System.err.println("\n" + e.getMessage());
        } catch (Exception e){
            System.err.println("unexpected error");
        }
    }
}
