package practice_Array;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {


        int[] arr1= {1,2,3};
        int[] arr2 = {4,5,6,7,8,9};

        int[]arr3 = new int[arr1.length+arr2.length];

        int k = 0;
        for (int i = 0; i < arr1.length; i++,k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        int[] b1 = {4,6,7,8,9,10};
        int[] b2 = { 110,12,456,789,11};

        int[] b3 = ArraysUtilities.merge(b1,b2);

        System.out.println(Arrays.toString(b3));


        double[] c1 = {1.2,5.6,3.8};
        double[] c2 = {5.6,4.7,9.2,10.2};

        double[] c3 = ArraysUtilities.merge(c1,c2);

        System.out.println(Arrays.toString(c3));

        System.out.println("----------------------------");

        String[] d1 = {"Aykut","sick","Iltek","soccer"};
        String[] d2 = {"Zeyn","coding","Nur","working","Ayhan","playing phone"};

        String[] d3 = ArraysUtilities.merge(d1,d2);
        System.out.println(Arrays.toString(d3));
    }
}

        /*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}
	        output
	            arr3 = {1,2,3,4,5,6}
 */

