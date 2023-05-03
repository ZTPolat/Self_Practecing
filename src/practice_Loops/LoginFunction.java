package practice_Loops;

import java.util.Scanner;

public class LoginFunction {

    public static void main(String[] args) {

        /*
        7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                 to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."

         */
        Scanner scan = new Scanner(System.in);

        String userName;
        String password;

        System.out.println("Enter your username: ");
        userName = scan.nextLine();

        System.out.println("Enter your password: ");
        password = scan.nextLine();


        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in.");
        } else {

            for (int i = 0; i < 3; i++) {

                System.err.println("Invalid enter, please enter username and password again:");

                System.out.println("Enter your username: ");
                userName = scan.nextLine();

                System.out.println("Enter your password: ");
                password = scan.nextLine();

                if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("Logged in.");
                    break;
                }

                if (i == 2) {
                    System.out.println("This is your last attempt, enter your username and password:");
                    userName = scan.nextLine();
                    password = scan.nextLine();
                }
            }

            System.out.println("Your account is locked!");

        }
      scan.close();

    }

}

