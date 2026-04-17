import java.util.Scanner;
public class charIsVowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character = ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u' ){
            System.out.print(ch + " is vowel");
        }else{
            System.out.println(ch + " is nor a vowel");
        }
        
        
    }

}
