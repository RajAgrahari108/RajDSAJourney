public class ReverseANumber {

    static int reverseNumber(int n) {

        int rev = 0;

        while (n > 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n = n / 10;
        }

        return rev;
    }

    public static void main(String args[]) {

        int n = 12345;

        int ans = reverseNumber(n);

        System.out.println("Reverse number is : " + ans);
    }
}