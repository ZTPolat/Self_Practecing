package practice_Loops;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {
        /*
        Create a class named UntilNegative and Write a program that calculates
        the sum of numbers entered by the user until user enters a negative number.
         */

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        while (number >= 0) {
            System.out.println("Enter a number:");
            number = input.nextInt();

            sum +=number;
        }
        System.out.println("sum of the numbers: "+ sum);

    }
}
