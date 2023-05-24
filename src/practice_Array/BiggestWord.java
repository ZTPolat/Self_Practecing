package practice_Array;

import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] words = new String[5];

        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }

        int longth = words[0].length();
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {

            if (longth < words[i].length()) {
                longth = words[i].length();
                longestWord = words[i];
            }
        }

        System.out.println(longestWord);


    }
}
/*
find and print the longest word in the array.
You can assume the elements will have different lengths.

inpu: [aaa,bbbb, whatstupppp, longg,jaaaavaaaaaaa]

output:  jaaaavaaaaaaa

 */
