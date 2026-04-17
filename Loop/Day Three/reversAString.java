public class reversAString {
    public static void main(String[] args) {
        String str = "Alexender" ;
        String revStr = "";
        char ch;
    for(int i =0; i<str.length(); i++){
        ch = str.charAt(i);
        revStr = ch + revStr;
    }
     
     System.out.println("Revers sting is : " + revStr);
    }
}
