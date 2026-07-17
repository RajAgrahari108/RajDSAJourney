

public class ManAndMin {
    public static void main(String args[]){
        int arr[]={8,1,5,9,6,7};

        printMax(arr);
        // printMin(arr);
    }
    static void  printMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
             if(max < arr[i]){
                max= arr[i];
             }
        }

    }

}
