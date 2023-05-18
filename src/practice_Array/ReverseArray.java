package practice_Array;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {122,300,450,600,700,800};

        numbers = ArraysUtilities.reverse(numbers);

        System.out.println(Arrays.toString(numbers));


        String[] names = {"Nur","Zeyn","Ayhan","Iltek","Ay"};

        names = ArraysUtilities.reverse(names);

        System.out.println(Arrays.toString(names));


        double[] nums = {3.5,4.5,5.6,7.8};

        nums = ArraysUtilities.reverse(nums);
        System.out.println(Arrays.toString(nums));



    }

}
