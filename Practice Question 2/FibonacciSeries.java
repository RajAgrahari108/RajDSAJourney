public class FibonacciSeries {

    static void fibonacciseries(int n){
        int f1=0, f2=1, sum = 0;

         System.out.print(f1 + " " + f2 + " ");

        for(int i=2; i<n; i++){
            sum = f1+f2;
            System.out.print(sum + " ");
            f1=f2;
            f2=sum;
        }
        // System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 10;
        fibonacciseries(n);
    }
}
