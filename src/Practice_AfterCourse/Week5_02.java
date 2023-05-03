package Practice_AfterCourse;

public class Week5_02 {

    public static void main(String[] args) {
        /*
        String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCB
         */

        String words = "ABCD";
        String result = "";

        for (int i = words.length() -1; i >=0 ; i--) {

            result += words.charAt(i);

        }

        System.out.println(result);



    }
}
