package loop_Practice02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,5,6,7,9,10,12};

        for (int each : numbers) {

            if (each % 2 != 0) {
                System.out.println(each);
            }
        }


        System.out.println("-------------------------");

        int[] nums = {100,20,30,40,5,4,3,8,1000,300,500};

        int max = nums[0];

        for (int eachNum : nums) {

            if (eachNum > max){
                max = eachNum;
            }
        }
        System.out.println(max);


        System.out.println("-------------------------");

        int[] b1 ={20,30,40,50,60,70};
        int[] b2 = {10,2,3,40,5,6};

        int k = 0;
        int[] b3 = new int[b1.length + b2.length];

        for (int each : b1) {
            b3[k++] = each;
        }

        for (int each : b2) {
            b3[k++] = each;
        }

        System.out.println(Arrays.toString(b3));
        System.out.println("------------------------------------");







    }

}
