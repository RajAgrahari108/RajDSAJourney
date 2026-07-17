public class SortAnArray0And1s {
    static void sortAnArray(int arr[]){
        int countZero=0, countOnes=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]== 0){
                countZero ++;
            }else{
                countOnes ++;
            }
           
        }
         System.out.println(countOnes);
         System.out.println(countZero);
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,1,0,1};
        sortAnArray(arr);
    }
}
