package practice_Loops;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number:");

        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("enter math operator:");
        char operator = input.next().charAt(0);

        boolean r = operator =='+' || operator =='-' ||operator =='*' ||operator =='/' ;

        while (!r){
            System.err.println("Invalid, enter again:");
            System.out.println("enter math operator:");
            operator = input.next().charAt(0);
        }
        double calculator = 0.00;
        switch (operator){
            case '+':
                calculator = num1 + num2;
                break;
            case '-':
                 calculator = num1 - num2;
                break;
            case '*':
                calculator = num1  * num2;
                break;
            default:
                calculator = num1 / num2;
                break;

        }

        System.out.println(calculator);

    }
}
