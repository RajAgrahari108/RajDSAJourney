import java.util.Scanner;

public class palindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int temp = num, reversedNum = 0;
        while(temp > 0){
            int reminder = temp % 10;

            num = num /10;
        }
System.out.println();
    }
}
