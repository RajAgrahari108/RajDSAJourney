
public class Duplicate {
    static void duplicatEl(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("the duplicate element is : "+ arr[i]);
                }
            }
            
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,6,7};

        duplicatEl(arr);
    }
}
