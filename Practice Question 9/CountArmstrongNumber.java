

public class CountArmstrongNumber {
    public static void main(String[] args) {
        int arr[] = {153, 370, 371, 407, 10, 25, 9474}; 
        int countArmst=0;
        for(int i=0; i<arr.length; i++){
            if(isArmstrongNum(arr[i])){
                System.out.println(arr[i]);
            countArmst++;

            }
        }
    }

    static boolean isArmstrongNum(int n){
       
        int sum = 0;
        int org = n;
        while(n>0){
            int digit = n%10;
            sum = sum + digit*digit*digit;
            n=n/10;
        }
        if(sum == org){
            return true
        }

    }
}
