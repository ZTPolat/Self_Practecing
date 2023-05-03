package practice_Loops;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        /*
         Create a class named DivideTwoNumbers and Write a program that can divide
          two positive numbers without using / (division) and * (multiplication) operators.

         */

        int num1 = 1090;
        int num2 = 67;
        int count = 0;

        while (num1> num2){
            num1 -= num2;
            count ++;

        }

        System.out.println(count + " with a remainder of "+ num1);


    }
}
