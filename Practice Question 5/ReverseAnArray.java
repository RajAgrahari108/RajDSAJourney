public class ReverseAnArray {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        ReverseArray(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
     }

     static void ReverseArray(int arr[]){
        int rev, first = 0, last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first]= temp;


            // int temp = arr[first];
            // arr[first] = arr[last];
            // arr[last]= temp;

             first++; last--;
        }
     }
}
