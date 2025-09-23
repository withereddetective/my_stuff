

public class distanceAnalyzer{

    public static double closestPerfectSquareDistance(int a, int b){
        
        int distance = Math.abs(a - b);
        double root = Math.floor(Math.sqrt(distance));
        return root;

    }

    public static void main(String[] args){

        System.out.println(closestPerfectSquareDistance(3, 12)); // closest is 3
        System.out.println(closestPerfectSquareDistance(5, 20)); // closest is 3
        System.out.println(closestPerfectSquareDistance(7, 7));  // closest is 0

    }
}