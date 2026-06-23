public class AverageOfAnArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,5,9,8,7};
        int avg ;
         int sum=0;
        for(int i=0; i<arr.length;i++){
            sum = sum +arr[i];
        }
        avg = (sum/arr.length);
        System.out.println("The Averga of array is : " + avg);
    }
}
