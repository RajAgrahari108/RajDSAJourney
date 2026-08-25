import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);

        arr.add(50);
        System.out.println(arr);


        arr.remove(0);
        System.out.println(arr);

    }
}
