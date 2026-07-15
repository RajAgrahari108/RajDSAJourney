

public class LinearSearch {
    public static int Searching(int arr[],  int target){
        int a = arr.length;
       
        for(int i=0; i<a; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
         int target = 0;
        int result = Searching(arr, target);

        if(result != -1){
            System.out.println("Element found at index : "+ result);
        }else{
            System.out.println("Target not found");
        }

    }
}
