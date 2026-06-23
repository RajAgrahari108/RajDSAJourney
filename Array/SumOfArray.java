

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={23, 40 , 50, 60 , 70};
        int sum = 0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            int  val = arr[i];
            sum = sum + val;
        }
          System.out.println(sum);
    }
}
