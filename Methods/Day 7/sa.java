public class sa {

    static boolean isSorted(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,8};

        boolean res = isSorted(arr);

       if(res == false){
        System.out.println("not sorted");
       }else{
        System.out.println("sorted");
       }
    }
}