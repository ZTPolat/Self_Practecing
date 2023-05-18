package practice_Array;

public class Classmates {
    public static void main(String[] args) {

        String[] classmates = {"John Jason","Zeynure Polat","Mahire Sultan","Ayhan Nur","Guzel Gul", "Reyime Jalal"};

        for (String each : classmates) {

            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")-1));
        }



    }

}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */
