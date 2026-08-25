public class Prime {
    public static void main(String[] args) {
        int n = 7;

        primeNumber(n);
    }

    public static void primeNumber(int n){
        if(n<2){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;

        for(int i=2; i<n; i++){
            if(n % i ==0){
                isPrime= false;
                break;
            }
        }

        if(isPrime){
            System.out.println("The number is prime number");
        }else{
            System.out.println("The Number is not prime");
        }
    }
}
