

public class sumOfPositiveAndNegative {
    static void sumOfPositive (int arr[]){
        int PositiveNumber = 0;
        int NegativeNumber = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                PositiveNumber = PositiveNumber + arr[i] ;
            }else{
                NegativeNumber = NegativeNumber + arr[i] ;
            }
        }
            System.out.println("the sum of positive element in a anarray is : " + PositiveNumber);
            System.out.println("the sum of NegativeNumber element in a anarray is : " + NegativeNumber);

    }
    public static void main(String[] args) {
        int arr[]={1,4,7,2,5,8,-1,-4,-7,2,-5,-8};
        sumOfPositive(arr);
    }
}
