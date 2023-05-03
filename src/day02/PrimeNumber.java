package day02;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 17;
        boolean t=true;

        for (int i = 2; i < number; i++) {

            if (number%i == 0) {
                t = false;
            }
        }

        if (t) {
            System.out.println("prime number = " + number);
        }
        else {
            System.out.println(number + " is not prime number");

        }
    }
}
