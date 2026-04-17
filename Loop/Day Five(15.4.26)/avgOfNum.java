import java.util.Scanner;
public class avgOfNum {
    public static void main(String[] args) {
    // int a=10, b=23, c=29;
    // int avg = (a + b+ c)/3;
    // System.out.println("The Average of three number is " + avg);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha number for Verage of three number");

        System.out.print("a is : ");
        int a= sc.nextInt();
        System.out.print("b is : ");
        int b= sc.nextInt();
        System.out.print("c is : ");
        int c= sc.nextInt();
        

        int avg = (a + b +c)/3;
        System.out.println("The average of three number is = " + avg);

        }
}
