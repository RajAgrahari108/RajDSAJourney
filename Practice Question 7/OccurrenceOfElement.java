public class OccurrenceOfElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 2, 9, 2};
        int target = 2;

        noOfOccurrence(arr, target);
    }

    public static void noOfOccurrence(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Number of occurrences: " + count)
    }
}