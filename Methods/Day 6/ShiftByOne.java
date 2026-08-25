public class ShiftByOne {

    static void shiftByKTime(int arr[]) {

        int n = arr.length;

        // Last element save
        int temp = arr[n - 1];

        // Shift elements to right
        for(int i = n - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }

        // Put last element at first
        arr[0] = temp;

        // Print array
        for(int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};

        shiftByKTime(arr);
    }
} 