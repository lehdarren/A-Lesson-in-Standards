import java.util.*;

public class BreakingTheRules {
    public static void main(String[] args) {

        /** Issue #1
         * IDS03-J Do not log unsanitized user input
         * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
         */

     public String sanitize(String msg) {
        Pattern newline = Pattern.compile("\n");
        Matcher matcher = newline.matcher(msg);
         return matcher.replaceAll("\n  ");
         }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        sanatize(username);

   
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        sanatize(password);
        
        System.out.println("Logging in with username: " + username + " and password: " + password);


        /**
         * Issue #2
         * NUM00-J. Detect or prevent integer overflow
         * https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow
         */

        int sum;
        int number = 100;

        sum = number + 28;

        System.out.println("The sum of number and 28 is " + sum);

        /**
         * Issue #3
         * NUM09-J. Do not use floating-point variables as loop counters
         * https://wiki.sei.cmu.edu/confluence/display/java/NUM09-J.+Do+not+use+floating-point+variables+as+loop+counters
         */

        for(int i = 0; i<100; i++) {
            System.out.println("Current number: " + 1);
        }
    }
}
