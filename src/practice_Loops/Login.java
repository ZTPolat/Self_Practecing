package practice_Loops;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u,p ;
        int attempt = 3;

        do {
            System.out.println("Enter username:");
            u = input.nextLine();
            System.out.println("Enter password:");
            p = input.nextLine();

            attempt --;

            if (attempt == 0){
                break;
            }

        }while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));


    }
}
