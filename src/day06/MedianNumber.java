package day06;

public class MedianNumber {

    public static void main(String[] args) {

        int a =87;
        int b = 65;
        int c = 43;


        if (a >b && b >c|| c>b && b> a){
            System.out.println(b + " is the median number");
        } else if (b >a && a >c || c >a && a >b){
            System.out.println(a + " is the median number" );

        }else{
            System.out.println(c+ " is the median number");
        }

    }
}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */
