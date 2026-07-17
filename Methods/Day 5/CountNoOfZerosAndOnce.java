
public class CountNoOfZerosAndOnce {
    static void countOnesAndZero(int arr[]){
        int CountZero = 0;
        int CountOne = 0;
        int CountOtherNumber = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                CountZero ++;
            }else if(arr[i]==1){
                CountOne ++;
            }else{
                CountOtherNumber ++;
            }
        }
        System.out.println("The number of zero is present in array : "+ CountZero);
        System.out.println("The number of once is present in array : "+ CountOne);
        System.out.println("The non zero and once is present in array : "+ CountOtherNumber
        );
    }
    public static void main(String[] args) {
        int arr[]= {1,0,1,2,0,3,0,1,4,0,1,4,1,6};
        countOnesAndZero(arr);
    }
}
