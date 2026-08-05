public class PrimeNum {
    public static void main(String[] args) {
        int num = 1;
        primeNumber(num);
    }

    static void primeNumber(int num) {

        if (num < 2) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}