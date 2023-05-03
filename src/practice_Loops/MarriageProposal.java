package practice_Loops;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        /*
         Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no

         */
        Scanner input = new Scanner(System.in);



            System.out.println("Will you marry me?");
            String yesOrNo = input.next().toLowerCase();


        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.err.println("Invalid answer, please re-enter:");
            yesOrNo = input.next().toLowerCase();
        }
            if (yesOrNo.equals("yes")){
                System.out.println("Congrats");
            }else if(yesOrNo.equals("no")){
                System.out.println("Goodbye");
            }


    }
}
