public class Car {

    String make;
    int year;

    public static void main(String[] args) {
        
        // creating the object
        Car car1 = new Car();
        car1.make = "idk";
        car1.year = 1997;

        // assigning to another variable
        Car car2 = car1;
        car2.year = 2001;

        // printing first reference
        System.out.println(car1.year);

    }
}
