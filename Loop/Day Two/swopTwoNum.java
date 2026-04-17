import java.util.Scanner;
public class swopTwoNum {
    public static void main(String[] args) {
        int a = 10, b =20, c;

        c = a; 
        a = b; 
        b = c;

        System.out.println("After swop the number A is : " + a);
        System.out.println("After swop the number B is : " + b);
    }
}
