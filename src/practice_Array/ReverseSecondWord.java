package practice_Array;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");

        for (int i = words[1].length()-1; i >0; i--) {

            String result ="";
            result += words[1].charAt(i);


        }
        System.out.println(Arrays.toString(words));
    }

}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
