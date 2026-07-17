public class fusa {
    static int isFirstUnsorted(int arr[]){
        for(int i=0; i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,4,5};
        int res = isFirstUnsorted(arr);

        System.out.println(res);

    }
}
