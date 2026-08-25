

public class PrintDigitOfANum {
    public static void main(String args[]){
        int n = 53127;
        int count = 0;
        int sum=0;
            while(n>0){
                int digit = n%10; // last digit nikalega
                System.out.println(digit);
                sum = sum + digit; // sum me add

                n= n/10;  // last digit remove karega
                count++;
            }
        System.out.println("the total digit is present is : " + count);
        System.out.println("the total sum of digit is  : " + sum);
    }
}
