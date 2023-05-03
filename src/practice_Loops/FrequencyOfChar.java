package practice_Loops;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        /*
        Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
         */

        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter a string:");
        String str= scan.nextLine().toLowerCase();

        System.out.println("Enter a char");
        char ch =scan.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch){
                count ++;
            }
        }

        System.out.println(count);





    }
}
