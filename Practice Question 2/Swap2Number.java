import java.util.Scanner;
class Swap2Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number x : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number y  : ");
        int y = sc.nextInt();

        
            // int temp = x;
            // x=y; 
            // y=temp;

            x=x+y;
            y=x-y;
            x=x-y;

        
        System.out.println("After swoping from x to y : "+ x);
        System.out.println("After swoping from y to x : "+ y);
    }
}