public class MisingNumber {
    static void findMissingNum(int n, int arr[]){
        int sum = 0;
        int sumN= (n*(n+1))/2;
        for(int i=0 ; i<arr.length; i++){
            sum = sum + arr[i];
        }

        int mssingNumber = sumN - sum;
        System.out.println(mssingNumber);

    }
    public static void main(String[] args) {

        int n = 6;
        int arr[]={1,2,3,5,6};

        findMissingNum(n, arr);
    }
}
