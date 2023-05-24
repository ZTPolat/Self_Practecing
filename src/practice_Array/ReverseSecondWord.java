package practice_Array;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            if (i == 1) {

                String secondWord = words[i];
                for (int j = secondWord.length() - 1; j >= 0; j--) {

                    result += secondWord.charAt(j);
                }
                result += " ";
            } else {
                result += words[i] + " ";
            }
        }
        System.out.println(result);


    }

}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java



                solution:

        String sentence = "I Love Java";

        String[] splitSent = sentence.split(" ");

        String result = "";

        for (int i = 0; i < splitSent.length; i++) {
            if(i == 1){
                String word = splitSent[i];
                for(int j = word.length() - 1; j >= 0; j --){
                    result += word.charAt(j) ;
                }
                result += " ";
            } else {
                result +=  splitSent[i] + " ";
            }
        }

        System.out.println(result);

 */
