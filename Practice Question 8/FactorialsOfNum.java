

public class FactorialsOfNum {
    public static void main(String[] args) {
        int num = 5;
        long factorials = 1;

        for(int i=1; i<=num; i++){
           factorials = factorials * i;
        }
        System.out.println(factorials);
    }
}
 