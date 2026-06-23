class SumOFArray{

    static void sumArray(int arr[]){
        int sum = 0;

        for(int i : arr){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int arr[]={1,3,5,7,9,11,13,15,17,19};
        sumArray(arr);

    }
}