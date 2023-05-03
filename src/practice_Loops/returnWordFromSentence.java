package practice_Loops;

import java.util.Scanner;

public class returnWordFromSentence {

    public static void main(String[] args) {

        /*
        return the frequency of the word java from a sentence
        eg:
        sentence = "java JAVA jAvA JAva"

        output:
        4
         */

    String  sentence = "java JAVA jAvA JAva java java java java";
       int count =0;
       String word = "java";
       sentence = sentence.toLowerCase();
       word = word.toLowerCase();

       while (sentence.contains(word)){
           count ++;
           sentence= sentence.replaceFirst(word,"");
       }


        System.out.println(count);






    }
}
