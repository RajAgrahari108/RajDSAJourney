public class SortedArray {

    static int isSorted(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            // Check unsorted condition
            if(arr[i] > arr[i + 1]) {

                System.out.println("Array is Not Sorted");

                return -1;
            }
        }

        System.out.println("Array is Sorted");

        return 1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,8,9};

        isSorted(arr);
    }
}