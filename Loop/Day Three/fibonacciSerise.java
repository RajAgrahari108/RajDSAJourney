import java.util.Scanner;


public class fibonacciSerise {
    public static void main(String agrs[]){
        // Scanner sc  = new Scanner(System.in);
        int n = 10 ;
        int a=0, b=1;
        int t;
        System.out.println("the first number of fibonacci Serise is : " + a);
        System.out.println("the second number of fibonacci Serise is : " + b);

        for(int i =3; i<=n; i++){
           t = a + b;
             System.out.print(t + " " );
            a = b;
            b = t;
        }
       
    }
}
