

public class Palindrom {
    public static void main(String[] args) {
        int n = 22;
        int ans = n;
        isPlaindrom(n,ans);

    }
    static void isPlaindrom(int n,int ans){
        int rev=0;
        while(n>0){
            int temp = n %10;
             rev = rev * 10 + temp;
            n= n / 10;
        }
         if(rev == ans){
        System.out.println("It is Palindrom");
    }else{
        System.out.println("Not a palindrom");
    }
    }
   
}
