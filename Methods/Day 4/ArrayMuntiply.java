public class ArrayMuntiply {
    static void arrayMulti(int arr[]){
        for(int  i = 0; i<arr.length;i++){
            int multi = arr[i]*10;
            // System.out.println("The Multiplaication of array is : " + multi);

            System.out.print(multi + " ");
        }
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,67,89};
        arrayMulti(arr);
    }
}
