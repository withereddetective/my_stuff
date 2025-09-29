public class stringAssignment1{
    public static void main(String[] args) {
        
        // setting the string
        String word = "quasirhombicosidodecahedron";

        // doing the assignment
        System.out.println("Word: " + word);
        System.out.println("Length: " + word.length());
        System.out.println("First Character: " + word.charAt(0));
        System.out.println("Last Character: " + word.charAt(word.length() - 1));
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());

    }
}