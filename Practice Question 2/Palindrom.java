public class Palindrom {
    static void isPalindeom(int n){
        int orig = n;
        int rev = 0;
        while(n !=0){
            int temp = n % 10;
            rev = rev *10 + temp;
            n = n /10;
        }
        if(orig==rev){
            System.out.println("Is Palindeom number. ");
        }else{
             System.out.println("Is not a Palindeom number . ");
        }
    }
    public static void main(String[] args) {
        int n  = 16462;
        isPalindeom(n);
        
    }
}
