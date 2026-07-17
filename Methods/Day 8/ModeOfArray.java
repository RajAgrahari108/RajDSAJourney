public class ModeOfArray {

    static void findMode(int arr[]) {

        int maxCount = 0;
        int mode = arr[0];

        // Outer loop
        for(int i = 0; i < arr.length; i++) {

            int count = 0;

            // Inner loop for frequency count
            for(int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    count++;
                }
            }

            // Check maximum frequency
            if(count > maxCount) {

                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("Mode of array is : " + mode);
    }

    public static void main(String[] args) {

       int arr[] = {8,9,9,3,6,5,4,7};

        findMode(arr);
    }
}