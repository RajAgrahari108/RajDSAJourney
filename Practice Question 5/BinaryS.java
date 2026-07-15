public class BinaryS {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int key = 1;

        int ans = findBinaryNum(key, arr);

        if(ans != -1){
            System.out.println("Key found at index : " + ans);
        }else{
            System.out.println("Key not found");
        }
    }

    public static int findBinaryNum(int key, int arr[]){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}