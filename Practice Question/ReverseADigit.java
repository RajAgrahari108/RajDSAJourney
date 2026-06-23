
public class ReverseADigit {
    public static void main(String args[]){
        int b= 12345;
        int rev=0 ;
        while(b>0){
            int digit = b%10;//last digit nikelna ke liya
            rev = rev* 10 + digit;
            b= b/10;
        }
        System.out.println(rev);
    }
}
