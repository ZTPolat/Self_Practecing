package practice_Loops;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {



    /*
    print all even number from 1 to 20
    print all odd number from 1 to 20
     */


        String even = "";
        String odd = "";
        for (int i = 1; i <= 20 ; i++) {

            if (i %2==0){
                even += i + " ";
            }else {
                odd += i+" ";
            }
        }

        System.out.println(even.trim());
        System.out.println(odd.trim());
    }
}
