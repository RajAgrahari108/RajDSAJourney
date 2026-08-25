public class Missingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,9};
        int n = 9;

        System.out.println(misingNumber(arr,n));
    }

    static int misingNumber(int arr[], int n){
         int expectedSum = n * (n + 1) / 2;
        int Sum = 0;
        for(int i : arr){
            Sum +=i;
        }
        return expectedSum - Sum;

    }
}
