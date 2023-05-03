package practice_Loops;

import java.util.Scanner;

public class OddOrEven02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number %2 ==0){
                System.out.println(number + " is an even number");
            }else {
                System.out.println(number +" is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!answer.equals("yes") && !answer.equals("no")){
                System.err.println("Invalid Enter, please enter again:");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you");
                break;
            }

        }



    }

}
