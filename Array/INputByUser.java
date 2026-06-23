import java.util.*;
public class INputByUser {
     public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Array creation
        int arr[] = new int[n];

        // Taking input from user
        for(int i = 0; i < n; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Assume first element is minimum
        int min = arr[0];

        // Finding minimum value
        for(int i = 1; i < n; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        // Output
        System.out.println("The minimum value is: " + min);

        sc.close();
    }
}
