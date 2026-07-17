public class MaxAndMin {

    public static void main(String args[]) {

        int arr[] = {8, 1, 5, 9, 6, 7};

        printMax(arr);
        printMin(arr);
    }

    // Maximum Element
    static void printMax(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }

    // Minimum Element
    static void printMin(int arr[]) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }
}