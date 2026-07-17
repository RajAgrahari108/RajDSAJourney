class UnsortedArray{

    static int getUnsortedArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return arr[i+1];
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,5,6,2,7,1};
       int res= getUnsortedArray(arr);
       System.out.println(res);

        // if(res != -1) {

        //     System.out.println("Unsorted element is : " + res);
        // }
        // else {

        //     System.out.println("Array is sorted");
        // }
    }
}