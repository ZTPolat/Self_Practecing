package practice_Loops;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        /*
        1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, repeat the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)


         */

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the first number:");
            double num1 = scan.nextDouble();

            System.out.println("Enter the operator:");
            char operator = scan.next().charAt(0);

            boolean r = operator == '+' || operator == '-' || operator == '*' || operator == '/';
            while (!r) {

                System.err.println("Invalid operator, Please enter again:");

                operator = scan.next().charAt(0);
            }

            System.out.println("Please enter the second number:");
            double num2 = scan.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    result = num1 / num2;

            }

            System.out.println(result);

            System.out.println(" Would you like to continue? (Yes/No)");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid enter, please enter yes or no");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for your playing!");
                break;
            }

        }


    }
}
