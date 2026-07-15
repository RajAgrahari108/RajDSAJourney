

public class LargerNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,8,4,5,6};
        printLargerNum(arr);
        System.out.println("the largest numberis :" +  printLargerNum(arr));
    }

    static int printLargerNum(int arr[]){
        int larger = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(larger < arr[i] ){
                larger=arr[i];
            }
        }
        return larger;
    }
}
