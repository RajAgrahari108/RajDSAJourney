

public class ArmstrongNum {
    public static void main(String[] args) {
        int n= 15, org = n;

        isArmstrongNum(n, org);
        
    }

    static void  isArmstrongNum(int n, int org){
        int Armstrong=0;
        while(n > 0){
            int digit = n % 10;
            Armstrong = Armstrong + digit*digit*digit;
            n = n /10;
        }
        if(Armstrong == org){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");

        }
    }
}
