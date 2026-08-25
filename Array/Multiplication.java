
public class Multiplication {
    public static void main(String args[]){
        int arr[] = {2,3,4,5};
        int n = arr.length;
        int ans  = 1;
        for(int i=0; i<n;i++){
            ans = ans * arr[i];
        }
        System.out.println(ans);
    }
}
