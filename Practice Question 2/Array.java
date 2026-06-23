public class Array {
    static void sumOfAray(int arr[]){
        int sum = 0;
        int n= arr.length;

        for(int i=0 ; i<n; i++){
            sum  =sum + arr[i];
        }
        System.out.println(sum);
    }

    static void printEvenOrOdd(int arr[]){

        System.out.println("even number present in a an array : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }

          System.out.println();

        System.out.println("odd number present in a an rray : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void primeNUmbeOrNot(int arr[]){
        
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        
        // sumOfAray(arr);
        // printEvenOrOdd(arr);
        primeNUmbeOrNot(arr);
    }
}
