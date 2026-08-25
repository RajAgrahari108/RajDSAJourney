public class Table {
    static void printTable(int n){
       
        for(int i=1; i<=10;i++){
            System.out.println("the value of "+n*i);
        }
    }
    public static void main(String args[]){
         int n = 2;
       printTable(n);
    }
}
