public class CountEvenOrOdd {
    static void count(int n){
        int oddCount=0;
        int evenCount =0;
        while(n>0){
            int temp = n % 10;
            if(temp%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            n = n/10;
        }
        System.out.println("Even Digits = " + evenCount);
        System.out.println("Odd Digits = " + oddCount);
    }
    public static void main(String[] args) {
        int n = 123456789;
        count(n);
    }
}
