public class MinArray {

    static void minArray(int arr[]) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        System.out.println(min);
    }

    public static void main(String args[]) {

        int arr[] = {2, 4, 3, 5, 6, 9, 2, 1, 4, 6};

        minArray(arr);
    }
}