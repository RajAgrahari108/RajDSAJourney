import java.util.Scanner;
public class powONum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = sc.nextInt();
        System.out.print("Enter the power = ");
        int pow = sc.nextInt();

        int initial = number;

        for(int i = 1; i<pow; i++){
            number = initial * number;
        }

        System.out.println(number);
    }
}
