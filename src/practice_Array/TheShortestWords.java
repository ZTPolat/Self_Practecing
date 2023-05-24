package practice_Array;

import java.util.Arrays;
import java.util.Scanner;

public class TheShortestWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        int shortest = words[0].length();

        for (String each : words) {
            if (each.length() < shortest){
                shortest = each.length();

            }

        }

        String shortWords = "";
        for (String each : words) {
            if (each.length() == shortest){
                shortWords += each +" ";
            }
        }
        //System.out.println(shortWords);
        System.out.println(Arrays.toString(shortWords.split(" ")));

    }

}
/*
Given a "String" 'str', find and print the shortest words.

input: olive, fish, pursuit,old, warning, python, java, coffee,cat ray
output: [old,cat,ray]
 */
