public class ReverseANString {
    public static void main(String[] args) {
        String rev= "";
        String str = "raj agrahari";
        int leng = str.length();
         for(int i= leng-1;i>=0;i--){
            rev = rev + str.charAt(i);
         }
         System.out.println(rev);

    }
}
