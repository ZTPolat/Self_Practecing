package practice_Loops;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        /*
        write a code for the log-in function of the Cydeo application
        assume that your credential are:
        username:Cydeo
        password: WoodenSpoon

        Ask user to enter their credentials:
        if credentials are matched , your program should print "logged in."

        if the credentials are not matched , the program should allow the user to have three attempts
        to enter correct credentials

        if  all three attempts are failed, then print "Your account is lucked."
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String userName = input.nextLine();
        System.out.println("Enter password:");
        String password = input.nextLine();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("login in.");
        } else {
            for (int i = 0; i < 3; i++) {

                if (i != 2) {
                    System.err.println("Incorrect username or password, please re-enter:");

                } else {
                    System.err.println("This is your last attempt, please re-enter:");
                }
                System.out.println("Enter username:");
                userName = input.nextLine();

                System.out.println("Enter password:");
                password = input.nextLine();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("You are now login in.");
                    break;
                }
            }

            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked!");
            }
        }


    }
}
