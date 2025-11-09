import java.util.Scanner;
public class combineStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter two strings: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String finalStr = "";
        
        if (str1.length() == str2.length()){

            for (int i = str1.length(); i > 0; i--){
                
                finalStr = finalStr + str2.charAt(i - 1);
                finalStr = finalStr + str1.charAt(i - 1);

            }

            System.out.println(finalStr);

        } else {
            System.out.println("error");
        }

    }
}
