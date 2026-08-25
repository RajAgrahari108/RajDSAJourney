
public class ShiftAllZeroInAFront {
    public static void main(String[] args) {
        int arr[]= { 1,0 , 0, 0, 1, 0,0,1,0,1,1,1};
        shiftAllZero(arr);
    }

    static void shiftAllZero(int arr[]){
        int n = arr.length;
        int  i=0, j=n-1;

        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                // int temp = arr[i];
                // arr[j]= arr[i];
                // arr[i]=temp;

                arr[i]=0;
                arr[j]=1;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
