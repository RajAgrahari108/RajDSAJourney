

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 3;
        isPrime(n);
    }

    static void isPrime(int a){
        if(a<2){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;

        for(int i=2; i<=a/2; i++){
            if(a % i == 0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a ptrime number");
        }
    }
}


