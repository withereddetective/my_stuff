
public class array_stuff {

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
        System.out.println("\b\b]");
    }

    public static int getSecondLargest(int[] arr){

        int largest = -1;
        int secondlargest = -1;

        for (int num : arr) {
            
            if ((largest < num) && (secondlargest < num)){
                secondlargest = largest;
                largest = num;
            } else if ((largest > num) && (secondlargest < num)){
                secondlargest = num;
            }

        }

        return secondlargest;
    }

    public static int getThirdLargest(int[] arr){

        int largest = -1;
        int secondlargest = -1;
        int thirdlargest = -1;

        for (int num : arr) {
            
            if ((largest <= num) && (secondlargest <= num) && (thirdlargest <= num)){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = num;
            } else if ((largest >= num) && (secondlargest <= num) && (thirdlargest <= num)){
                thirdlargest = secondlargest;
                secondlargest = num;
            } else if ((largest >= num) && (secondlargest >= num) && (thirdlargest <= num)){
                thirdlargest = num;
            }

        }

        return thirdlargest;
    }

    public static int[] reverseArray(int[] arr){

        int[] newArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--){
            newArr[arr.length - 1 - i] = arr[i];
        }

        arr = newArr;
        return arr;
    }

    public static int[] weirdReverseArray(int[] arr, int k){

        int[] newArr = new int[arr.length];

        if (k < arr.length){
            for (int i = k - 1; i >= 0; i--){
                newArr[k - 1 - i] = arr[i];
            }

            for (int i = arr.length - 1; i >= k; i--){
                newArr[arr.length - 1 - i + k] = arr[i];
            }
        } else {
            newArr = reverseArray(arr);
        }

        arr = newArr;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[] {12, 35, 1, 10, 34, 1}));
        System.out.println(getSecondLargest(new int[] {10, 5, 10}));
        System.out.println(getSecondLargest(new int[] {10, 10, 10}));
        System.out.println(getThirdLargest(new int[] {2, 4, 1, 3, 5}));
        System.out.println(getThirdLargest(new int[] {10, 2}));
        System.out.println(getThirdLargest(new int[] {5, 5, 5}));
        printArray(reverseArray(new int[] {1, 4, 3, 2, 6, 5}));
        printArray(reverseArray(new int[] {4, 5, 2}));
        printArray(reverseArray(new int[] {1}));
        printArray(weirdReverseArray(new int[] {1, 2, 3, 4, 5}, 3));
        printArray(weirdReverseArray(new int[] {5, 6, 8, 9}, 5));
    }
}
