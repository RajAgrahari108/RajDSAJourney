
public class CountEven {
    static void checkEven(int arr[]){
        int EvevCount=0, OddCount=0;
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i];
            if(arr[i] % 2==0){ 
                EvevCount ++;
            }else{
               OddCount++;
            }
        }
        System.out.println("The even number present in array : "+ EvevCount);
        System.out.println("The even number present in array : "+ OddCount);
        System.out.println("The sum of odd and even number present in array is : "+ sum);
    }
    public static void main(String args[]){
        int arr[]= {0,1,2,3,4,5,6,7,8,9,10};
        checkEven(arr);
    }
}
