package day02;

import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        boolean r = true;

        for (int i = 2; i < number; i++) {

             if (number %i == 0) {
                 r = false;
                break;
             }
        }
        if (r) {
            System.out.println(number + " is prime number");
        }
        else {
            System.out.println(number + " is not prime");
        }
    }

}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */
