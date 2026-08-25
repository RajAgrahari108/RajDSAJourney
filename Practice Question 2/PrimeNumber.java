public class PrimeNumber {
    static boolean primeOrNot(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 12;
        boolean ans=primeOrNot(n);

        if(ans == true){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");

        }
    }
}
