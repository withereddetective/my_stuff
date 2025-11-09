import java.util.Scanner;
public class latitudeLongitude {

    public static boolean isDouble(String num){

        try{

            double x = Double.parseDouble(num);
            return true;

        } catch (Exception e){

            return false;

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double biggestLon, biggestLat, smallestLon, smallestLat, currentLon, currentLat;
        biggestLon = 0;
        biggestLat = 0;
        smallestLon = 0;
        smallestLat = 0;
        String currentRead;

        while (true){

            while (true){
                System.out.print("Please enter the longitude: ");
                currentRead = scan.nextLine();
                if (isDouble(currentRead)){
                    currentLon = Double.parseDouble(currentRead);
                    if (currentLon >= -180 && currentLon <= 180){
                        break;
                    } else {
                        System.out.println("invalid longitude value");
                    }
                } else {
                    System.out.println("invalid input");
                }
            }

            while (true){
                System.out.print("Please enter the latitude: ");
                currentRead = scan.nextLine();
                if (isDouble(currentRead)){
                    currentLat = Double.parseDouble(currentRead);
                    if (currentLat >= -90 && currentLat <= 90){
                        break;
                    } else {
                        System.out.println("invalid latitude value");
                    }
                } else {
                    System.out.println("invalid input");
                }
            }

            if (currentLon > biggestLon){
                biggestLon = currentLon;
            } else if (currentLon < smallestLon){
                smallestLon = currentLon;
            }

            if (currentLat > biggestLat){
                biggestLat = currentLat;
            } else if (currentLat < smallestLat){
                smallestLat = currentLat;
            }

            System.out.println("input 1 if you want to enter another location: ");
            if (!(scan.nextLine().equals("1"))){
                break;
            }
        }

        System.out.println("Farthest North: " + biggestLat);
        System.out.println("Farthest South: " + smallestLat);
        System.out.println("Farthest East: " + biggestLon);
        System.out.println("Farthest West: " + smallestLon);

    }
}
