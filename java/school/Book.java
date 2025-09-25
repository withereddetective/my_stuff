public class Book {

    String title, author;

    public void printBookInfo(){

        System.out.println(title + " by " + author);

    }

    public static void main(String[] args){

        // making the first book
        Book book1 = new Book();
        book1.title = "Animal Farm";
        book1.author = "George Orwell";

        // making the second book
        Book book2 = new Book();
        book2.title = "Brave New World";
        book2.author = "Aldous Huxley";

        // calling the methods
        book1.printBookInfo();
        book2.printBookInfo();

    }
}
