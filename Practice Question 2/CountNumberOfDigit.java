class CountNumberOfDigit{
    static void countNum(int n){
        int count = 0;
        while(n !=0){
            n = n/10;
            count ++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 145678;
        countNum(n);
    }
}