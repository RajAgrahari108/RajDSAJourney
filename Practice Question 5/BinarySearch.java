public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        int start = 0;
        int end = arr.length - 1;
        int key = 100;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                System.out.println("Key is found at index : " + mid);
                return;
                    
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Key not found");
    }
}