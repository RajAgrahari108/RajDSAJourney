

public class MaxAndMin {

    static void maxAndMinValue(int arr[]){
        int max = arr[0], min = arr[0];

            for(int j=1; j<arr.length;j++){

                if(arr[j] > max){
                   max= arr[j];
                }

                if(arr[j] < min){
                   min= arr[j] ;
                }
            }
            System.out.println("Maximum Value = " + max);
            System.out.println("Minimum Value = " + min);
    }
    public static void main(String[] args) {
        int arr[] = {12,14,15,18,20,80,11};
        maxAndMinValue(arr);
    }
}
