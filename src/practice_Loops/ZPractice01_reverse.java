package practice_Loops;

public class ZPractice01_reverse {

    public static void main(String[] args) {


        String str = "zeynure";
        String reverse = "";

        for (int i = str.length()-1; i >=0 ;i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }


}
