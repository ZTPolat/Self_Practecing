package practice_Loops;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        /*
        Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

         */

        Scanner scan = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num>0){
                countPositive ++;
            } else if (num <0) {
                countNegative ++;
            }

        }
        System.out.println(countPositive +" positive and "+ countNegative + " negative");



    }
}
