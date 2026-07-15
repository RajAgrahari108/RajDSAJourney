

public class FindTheTarget {
    public static void targetFind(int arr[]){
        int a = arr.length;
        int target = 0;

        for(int i=0; i<a;i++){
                if(arr[i]==target){
                    System.out.println("target Found At index : " + i);
                    break;
                }else{
                    System.out.println("Target is no found");
                }
        }
    }


    public static void main(String args[]){
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        targetFind(arr);
    }

    
}
