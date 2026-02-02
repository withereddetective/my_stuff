import java.util.Arrays;
public class reverse_array {
    
    public static int[] reverseArray(int[] arr){

        int[] newArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--){
            newArr[arr.length - 1 - i] = arr[i];
        }

        arr = newArr;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[] {1, 4, 3, 2, 6, 5})));
        System.out.println(Arrays.toString(reverseArray(new int[] {4, 5, 1, 2})));
    }
}
