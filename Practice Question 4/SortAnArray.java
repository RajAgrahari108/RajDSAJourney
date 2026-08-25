
public class SortAnArray {
    static void sortAssending(int arr[]){
        int a = arr.length-1;

        for(int i=0; i<a; i++){
            for(int j=0; j<a-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,8,5,4,6,3,2,7};
        sortAssending(arr);
    }
}
