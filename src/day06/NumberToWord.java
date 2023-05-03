package day06;

public class NumberToWord {

    public static void main(String[] args) {
        
        int num=7;
        
        if (num == 0){
            System.out.println("Zero");
        } else if (num == 1){
            System.out.println("One");
        } else if (num == 2){
            System.out.println("Two");
        } else if (num == 3) {
                System.out.println("Tree");

            } else if (num == 4) {
                System.out.println("Four");
            } else if (num == 5) {
                System.out.println("Five");

            }else if (num ==6){
            System.out.println("Six");

        } else if (num == 7 ) {
            System.out.println("Seven");

        } else if (num ==8) {
            System.out.println("Eight");

        } else {
            System.out.println("Nine");

        }

    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */
