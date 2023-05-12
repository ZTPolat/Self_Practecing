package loop_Practice02;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        /*
        Extra Spicy:

	8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)


         */
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("Do you want to reserve a room?Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {

            System.out.println("Invalid entry, please enter again:");
            yesOrNo = input.next().toLowerCase();
        }

        if (yesOrNo.equals("yes")) {

            System.out.println("What type of room you want?");

            System.out.println("\tKing bed = $120");
            System.out.println("\tQueen bed = $100");
            System.out.println("\tSingle bed = $80");

            String room = input.nextLine().toLowerCase();
            //System.out.println("ok");

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Invalid bed type entry, please re-enter:");
                room = input.nextLine().toLowerCase();

            }

            switch (room) {
                case "king bed":
                    total += 120;
                    break;
                case "queen bed":
                    total += 100;
                    break;
                default:
                    total += 80;
            }



            System.out.println("Your total price is $= " + total);


        } else {
            System.out.println("Have a nice day!");
        }

        input.close();

    }

}



