package practice_Loops;

import java.util.Scanner;

public class ReturnCharacter {
    public static void main(String[] args) {

        /*
        return the frequency of a character from a string

        ex: str = "aaaabbbbccccc"
            ch = 'c'
          output = 5

         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter character:");
        String character = input.next().toLowerCase();

        String str = "aaaabbbbbbbbcccccjjjjjdddd";
        int count =0;
        //char ch = 'c';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (character.equals(""+ch)){
                count ++;

                /*
                if(str.charAt(i)==ch){
                count ++;

                 */
            }

        }
        System.out.println(count);




    }


}
