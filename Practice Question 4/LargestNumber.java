

public class LargestNumber {
    static int largestEl(int arr[]){
            int largest =Integer.MIN_VALUE;
            int smallest =Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest=arr[i];   
            }if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
       System.out.println("the Smallest number is : " +  smallest);
        return largest;
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5};

       System.out.println("the largest number is : " +  largestEl(arr));
    }
}
