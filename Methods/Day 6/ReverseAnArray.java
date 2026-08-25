

public class ReverseAnArray {
    static void reverseArray(int arr[]){
        int temp;
        int start = 0, End = arr.length-1;
        while(start<=End){
            temp= arr[start];
            arr[start] = arr[End];
            arr[End]=temp;
            start++;
            End--;
        }
         for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
    }

}
