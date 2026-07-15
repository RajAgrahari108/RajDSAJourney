public class SortAnArray0And1s {

    static void sortAnArray(int arr[]) {

        int countZero = 0;

        // Count zeros
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                countZero++;
            }
        }

        // Fill 0s
        for(int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Fill 1s
        for(int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print Sorted Array
        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 1, 0, 1, 1, 0, 1,2};

        sortAnArray(arr);
    }
}