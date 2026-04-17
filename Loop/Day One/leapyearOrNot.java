import java.util.Scanner;

public class leapyearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tha year = ");
        int year = sc.nextInt();
        if(year  % 100 == 0 || year  % 400 == 0 || year  % 4 == 0 ){
            System.out.println("year in leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}