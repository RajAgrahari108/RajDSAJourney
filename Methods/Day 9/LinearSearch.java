

public class LinearSearch {
    static void linerSearch(int arr[]){
        int key = 6;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("element fount on index no : " + i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9,6,10};

        linerSearch(arr);
    }
}
