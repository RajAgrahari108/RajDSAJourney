
public class sortedArray {
    static void unsortedArray(int arr[]){
        boolean sorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                sorted =false;
                break; 
            }
        }
        if(sorted==true){
            System.out.println("Array is sorted");
        }else{
             System.out.println("Array is not sorted");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        unsortedArray(arr);
    }
}
