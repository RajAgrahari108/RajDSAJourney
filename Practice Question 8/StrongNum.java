public class StrongNum {
    public static void main(String[] args) {
        int n = 145;
        int original = n;
        isStringnum(n, original);
    }

    public static void isStringnum(int n,int origial){
         int sum =0;
        while(n>0){
            int factorial = 1;
            int temp = n % 10;
                for(int i=1; i<=temp; i++){
                factorial *= i;
                
                }
                sum +=factorial;
            n = n / 10;
        }
       if( sum == origial){
        System.out.println("Strong number");
       }else{
        System.out.println("not");
       }
    }
}
