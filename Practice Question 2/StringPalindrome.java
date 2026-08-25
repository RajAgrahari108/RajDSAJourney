public class StringPalindrome {
    static void isStringPalindrome(String str){
        String org= str,rev="";
        int n = str.length();

        for(int i=n-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(org.equals(rev)){
            System.out.println("String Palindrome");
        }else{
            System.out.println("not a String Palindrome");

        }
    }

    public static void main(String[] args) {
        String str = "MADAM";
        isStringPalindrome(str);
    }
}
