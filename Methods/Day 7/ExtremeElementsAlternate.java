public class ExtremeElementsAlternate {

    static void extremeElements(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            // Agar same element bacha
            if(start == end) {
                System.out.print(arr[start] + " ");
            }
            else {

                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};

        extremeElements(arr);
    }
}