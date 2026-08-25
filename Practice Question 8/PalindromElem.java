

public class PalindromElem {
    public static void main(String[] args) {
        int arr[]={1,55,25,88,99,2,1};
        for(int i=0; i<arr.length; i++){
            if(isPlaindromEl(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

    static boolean isPlaindromEl(int n){
        int rev = 0,temp;
        int orgi = n;
        while(n>0){
            temp = n % 10; 
            rev = rev * 10 + temp;
            n = n/10;
        }
        return orgi == rev;
       
    }
}
