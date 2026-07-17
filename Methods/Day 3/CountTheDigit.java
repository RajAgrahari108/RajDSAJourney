
public class CountTheDigit {
   

    static int countADigit(int n) {

        int count = 0;

        while (n > 0) {

            n = n / 10;
            count ++;
        }
        return count;
    }

    public static void main(String args[]) {

        int n = 12345;

        int ans = countADigit(n);

        System.out.println("Reverse number is : " + ans);
    }
}

