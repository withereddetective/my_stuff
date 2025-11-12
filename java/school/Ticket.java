import java.util.Random;

public abstract class Ticket{

    private int serialNumber;

    public Ticket(){
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString(){
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSerialNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(999 - 100 + 1) + 100;
        return randomNumber;
    }


    public static void main(String[] args) {
        
        Advance advancedTicket1 = new Advance(5);
        Advance advancedTicket2 = new Advance(15);
        System.out.println(advancedTicket1.toString() + "\n\n" + advancedTicket2.toString());

        StudentAdvance SadvancedTicket1 = new StudentAdvance(5);
        StudentAdvance SadvancedTicket2 = new StudentAdvance(15);
        System.out.println("\n\n\n" + SadvancedTicket1.toString() + "\n\n" + SadvancedTicket2.toString());

    }

}

class Advance extends Ticket{

    int price = 40;

    public Advance(int days){
        super();
        if (days >= 10){
            price = price - 10;
        }
    }

    @Override public double getPrice(){
        return price;
    }

}

class StudentAdvance extends Advance{

    public StudentAdvance(int days){

        super(days);

        price = price / 2;

    }

    @Override public String toString(){

        return super.toString() + "\n(student ID required)";

    }

}
