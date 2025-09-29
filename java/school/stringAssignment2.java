public class stringAssignment2 {
    public static void main(String[] args) {
        
        // setting original
        String original = "HelloWorld";

        // setting the halves
        String firstHalf = original.substring(0, 5);
        String secondHalf = original.substring(5);

        // making new variable
        String new_String = firstHalf + " " + secondHalf;

        // output
        System.out.println("Original: " + original);
        System.out.println("First Part: " + firstHalf);
        System.out.println("Second Part: " + secondHalf);
        System.out.println("New String: " + new_String);

    }
}
