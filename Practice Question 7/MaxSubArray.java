
public class MaxSubArray {
    public static void main(String[] args) {
        // int arr[]={1,-1,-2, 6, 3};
        int arr[]={2,4,6,8,10};

        printSubArray(arr);
    }


    public static void printSubArray(int arr[]){
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    // System.out.print(arr[k] + " ");
                    currSum +=arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum; 
                }
                // System.out.println();  
            }
            // System.out.println();
        }
        System.out.println("max sum = " + maxSum);
    }
}
