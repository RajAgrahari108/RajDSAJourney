

public class CheckDuplicate {

    static boolean duplicateElement(int arr[]){
        int a = arr.length;

        for(int i=0; i<a; i++){
            for(int j=i+1; j<a; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2};
        System.out.println(duplicateElement(arr));
    }
}