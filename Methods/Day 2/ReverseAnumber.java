public class ReverseAnumber {
    static int isReverse(int n){
        int rev= 0;
        while(n>0){
            int digit = n%10;
            rev= rev*10 + digit;
            n= n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        int n =12345;
        int ans = isReverse(n);
        System.out.println(ans);
    }
}
