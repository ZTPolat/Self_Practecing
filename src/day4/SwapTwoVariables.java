package day4;

public class SwapTwoVariables {

    public static void main(String[] args) {
         int x = 10;
         int y = 15;
         int z;

        System.out.println("Current value is: x=" + x);
        System.out.println("Current value is: y=" + y);

         z = x;
         x = y;
         y = z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
/*
8. Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10


 */
