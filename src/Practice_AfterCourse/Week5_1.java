package Practice_AfterCourse;

public class Week5_1 {
    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */


    public static void main(String[] args) {
        String str = "ABCABBCCCCDEF";

        String unique = "";// "DEF"
        int count = 0;

            for (int i = 0; i < str.length(); i++) { // i: index numbers of str

                char each= str.charAt(i);

                if (unique.contains("" +each)){// if the string result does not contain the character of string yet
                    count ++;
                    if (count == 1){
                        unique += each;
                    }

                }


            }
            System.out.println(unique);
        }
    }

