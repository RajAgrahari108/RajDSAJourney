

public class AllCode {
    
    static void isEvenOrOdd(int n){
        if(n%2==0){
            System.out.println("The Number is Even : "+n);
        }else{
             System.out.println("The Number is odd : "+n);
        }

    }

    static void findSquare(int a){
        int sqr = a*a;
        System.out.println("the sqr of a number is : " + sqr);
    }

    static void findMax(int x, int y){
        if(x>y){
            System.out.println("x ids grater then y : ");
        }else{
            System.out.println("y is grater then x");
        }
    }

    static void findFactorial(int x){
        int fact = 1;
        for(int i=1; i<=x;i++){
            fact = fact * i;
        }
          System.out.println("The factorial of "+ x + " is : "+fact);
    }


    static void primeOrNot(int x){
        for(int i=2; i<=x;i++){
            if(x%i==0){
                System.out.println("Not A Prime number");
            }else{
                System.out.println("Prime number");
            }
        }
    }
    public static void main(String args[]){
        // int n  = 19;
        // isEvenOrOdd(n);

        // int a = 5;
        // findSquare(a);

        // int x=10, y=20;
        // findMax(x,y);
        
        // int x=9;
        // findFactorial(x);

        int x= 7;
        primeOrNot(x);
    }
}
