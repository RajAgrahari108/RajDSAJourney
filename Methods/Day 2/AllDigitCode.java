public class AllDigitCode {

    static void isReverse(int n) {

        int rev = 0;

        while(n > 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n = n / 10;
        }

        System.out.println("Reverse Number = " + rev);
    }

    static void isCountNoOfDigit(int n) {

        int count = 0;

        while(n > 0) {

            n = n / 10;

            count++;
        }

        System.out.println("Total Digits = " + count);
    }

    static void isSumOfDigit(int n) {

        int sum = 0;

        while(n > 0) {

            int digit = n % 10;

            sum = sum + digit;

            n = n / 10;
        }

        System.out.println("Sum of Digits = " + sum);
    }

    public static void main(String args[]) {

        int n = 12345;

        isCountNoOfDigit(n);
        isReverse(n);
        isSumOfDigit(n);
    }
}