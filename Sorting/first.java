package Sorting;

public class first {

    public static void main(String[] args) {
        int arr[] = {5,2,4,1,0,3,8};

        bubbleSorting(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void bubbleSorting(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){

                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}