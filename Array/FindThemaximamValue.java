
public class FindThemaximamValue {
    public static void main(String args[]){
        int arr[]={2,4,2,1,4,9,4,6,7};
        int n = arr.length;
         int max = arr[0];
        for(int i=0; i<n; i++){
           
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("The maximam Value is : " +max);
    }
}
