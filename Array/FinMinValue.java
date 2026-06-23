

public class FinMinValue {
    public static void main(String args[]){
        int arr[]={2,4,2,1,4,9,4,6,7};
        int n = arr.length;
         int min = arr[0];
        for(int i=0; i<n; i++){
           
            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("The min Value is : " +min);
    }
}
