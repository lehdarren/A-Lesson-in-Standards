import java.util.*;

public class BreakingTheRules {
    public static void main(String[] args) {

        /** Issue #1
         * IDS03-J Do not log unsanitized user input
         * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("Logging in with username: " + username + " and password: " + password);

        /**
         * Issue #2
         * NUM00-J. Detect or prevent integer overflow
         * https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow
         */

        byte sum;
        int number = 100;

        sum = number + 28;

        System.out.println("The sum of number and 28 is " + sum);

        /**
         * Issue #3
         * NUM09-J. Do not use floating-point variables as loop counters
         * https://wiki.sei.cmu.edu/confluence/display/java/NUM09-J.+Do+not+use+floating-point+variables+as+loop+counters
         */

        for(float x = 0.1f; x <= 1.5f; x += 0.15f) {
            System.out.println("Current number: " + x);
        }
    }
}
