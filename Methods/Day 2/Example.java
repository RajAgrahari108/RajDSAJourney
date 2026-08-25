public class Example {

    static void printWelcome(){
        System.out.println("Welcome to Code with raj");
    }
    static int calculateTotla(int solved, int bonus){
        return solved+bonus;
    }
    static boolean isEligibleForBadge(int streakDays){
        return streakDays>=30;
    }
    public static void main(String args[]){
        printWelcome();

        int finalScore = calculateTotla(120, 15);
        System.out.println("Final Score: " + finalScore);

        boolean eligible = isEligibleForBadge(35);
        System.out.println("badge Eligible : " + eligible);
    }
} 
