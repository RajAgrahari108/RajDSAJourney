public class BIggestElement {
    public static void main(String[] args) {
        int arr[]={30,40,10,20,90,50,60};

        biggestEl(arr);
    }

    static void biggestEl(int arr[]){
        int biggEl = Integer.MIN_VALUE;
        int smallEl=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>biggEl){
                biggEl=arr[i];
            }
            if(arr[i]<smallEl){
                smallEl=arr[i];
            }
        }
        System.out.println("THe biggest element presernt in an array is : " + biggEl);
        System.out.println("THe Smallest element presernt in an array is : " + smallEl);
    }
}
