
import java.util.*;
public class one {
    public static void main(String args[]){
        int arr[] = new int[5];

        // input
    Scanner sc = new Scanner(System.in);
    int n = arr.length;
    for(int  i =0; i<n; i++){
        System.out.println("Provide input for index: " + i);
        arr[i] = sc.nextInt();
    }

    // print
    System.out.println("your array contains : ");
    for(int val:arr){
        System.out.println(val);
     }
    }
}
