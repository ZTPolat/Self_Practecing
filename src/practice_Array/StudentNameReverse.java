package practice_Array;

import utilities.ArraysUtilities;

public class StudentNameReverse {
    public static void main(String[] args) {

        String[] classmates = {"John Jason", "Zeynure Polat", "Mahire Sultan", "Ayhan Nur", "Guzel Gul", "Reyime Jalal"};


        for (String each : classmates) {

            String result = "";

            for (int i = each.length()-1; i >= 0 ; i--) {

                 result += each.charAt(i);

            }

            System.out.println(result);
           }



    }

}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
