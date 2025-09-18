public class methodsWoohoo {
    
    public static int triple(int num){
        return num * 3;
    }

    public static boolean isEven(int num){
        return (num % 2) == 0;
    }

    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }


    public static void main(String[] args) {
        
        System.out.println(triple(7));
        System.out.println(isEven(12));
        greet("AP Student");

    }

}
