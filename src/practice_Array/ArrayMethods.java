package practice_Array;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13};

        int[] a3 = Arrays.copyOf(a1,a1.length +a2.length);

        for (int i = 0, j= a1.length; i < a2.length; i++,j++) {
            a3[j] = a2[i];

        }

        System.out.println(Arrays.toString(a3));



    }
}
