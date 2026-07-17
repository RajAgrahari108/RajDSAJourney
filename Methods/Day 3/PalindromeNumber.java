
public class PalindromeNumber {

    static void isPalindrome(int num) {

        int original = num;

        int rev = 0;

        while (num > 0) {

            int temp = num % 10;

            rev = rev * 10 + temp;

            num = num / 10;
        }

        if (original == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void main(String[] args) {

        int num = 121;

        isPalindrome(num);
    }
}