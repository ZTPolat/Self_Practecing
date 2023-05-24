package practice_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String reverse = "";

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            reverse += words[i];

        }

        System.out.println(reverse.trim());



    }

}
/*
input :
     Java is fun

output:
     fun is Java
 */
