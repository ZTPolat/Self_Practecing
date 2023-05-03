package practice_Loops;

public class PrintStar {

    public static void main(String[] args) {

        /*
         Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *

         */

        for (int i = 1; i<11 ; i++) {

            for (int j = 0; j <i ; j++) {

                System.out.print("* ");


            }

            System.out.println();
            }



        }

    }
