public class TrappedRainWater {
    public static void main(String[] args) {
        int arr[]={};

    }
    public static void trappedRainWater(int arr[]){
        int n = arr.length;
        //left

        int leftMax[]= new int[n];
        leftMax[0]= arr[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }

        int righMax[]= new int[n];
        righMax[n-1]=arr[n-1];
        for(int i=n-2; i>0; i--){
            righMax[i]=Math.max(arr[i],righMax[i+1]);
        }
    }

}
