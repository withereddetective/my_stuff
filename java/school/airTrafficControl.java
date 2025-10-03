import java.util.Scanner;

class Airplane{

    String cs;
    double dist;
    int dir, alt;

    public Airplane(){

        cs = "AAA01";
        dist = 1;
        dir = 0;
        alt = 0;

    }

    public Airplane(String calls, double dista, int dire, int altr){

        cs = calls;
        dist = Math.abs(dista);
        alt = Math.abs(altr);

        if (dire < 0 || dire > 360){
            dir = dire % 360;
        }

    }

    public void move(double dista, int dire){

        dist += dista;
        dir += dire;

    }

    public void gainAlt(){

        alt += 1000;

    }

    public void loseAlt(){

        alt -= 1000;

    }

    public int getAlt(){

        return alt;

    }

    public String toString(){

        return cs + " - " + dist + " miles away at bearing " + dir + "°, altitude " + alt + " feet";

    }

    public double distTo(Airplane other){

        return Math.abs(dist - other.dist);

    }

    public int altTo(Airplane other){

        return Math.abs(alt - other.alt);

    }
}

public class airTrafficControl{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Airplane Airplane1 = new Airplane();
        Airplane Airplane2 = new Airplane("AAA02", 15.8, 128, 30000);

        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
        Airplane Airplane3 = new Airplane(scan.nextLine().toUpperCase(),
                                          Double.parseDouble(scan.nextLine()),
                                          Integer.parseInt(scan.nextLine()),
                                          Integer.parseInt(scan.nextLine()));
        
        System.out.print("\n");
        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + Airplane1.toString());
        System.out.println("\"Airplane 2\": " + Airplane2.toString());
        System.out.println("\"Airplane 3\": " + Airplane3.toString());
        
        System.out.print("\n");
        System.out.println("Initial Distances:");
        System.out.println("The distance between Airplane 1 and Airplane 2 is " + Airplane1.distTo(Airplane2) + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + Airplane1.distTo(Airplane3) + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + Airplane2.distTo(Airplane3) + " miles.");
        
        System.out.print("\n");
        System.out.println("Initial Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Airplane1.altTo(Airplane2) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Airplane1.altTo(Airplane3) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Airplane2.altTo(Airplane3) + " feet.");


        Airplane1.move(Airplane2.distTo(Airplane3), 65);
        Airplane2.move(8, 135);
        Airplane3.move(5, 55);
        for (int i = 0; i < 3; i++) {
            Airplane1.gainAlt();
        }
        for (int i = 0; i < 2; i++) {
            Airplane2.gainAlt();
        }
        for (int i = 0; i < 4; i++) {
            Airplane3.gainAlt();
        }
        

        System.out.print("\n");
        System.out.println("New Positions:");
        System.out.println("\"Airplane 1\": " + Airplane1.toString());
        System.out.println("\"Airplane 2\": " + Airplane2.toString());
        System.out.println("\"Airplane 3\": " + Airplane3.toString());
        
        System.out.print("\n");
        System.out.println("New Distances:");
        System.out.println("The distance between Airplane 1 and Airplane 2 is " + Airplane1.distTo(Airplane2) + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + Airplane1.distTo(Airplane3) + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + Airplane2.distTo(Airplane3) + " miles.");
        
        System.out.print("\n");
        System.out.println("New Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Airplane1.altTo(Airplane2) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Airplane1.altTo(Airplane3) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Airplane2.altTo(Airplane3) + " feet.");

    }
}