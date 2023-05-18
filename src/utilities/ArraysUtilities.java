package utilities;

public class ArraysUtilities {

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+ arr2.length];

        int k =0;

        for (int i = 0; i < arr1.length; i++,k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k]=arr2[i];
        }

        return arr3;

    }

    public static double[] merge(double[] arr1,double[] arr2){

        double[] arr3 = new double[arr1.length+ arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]= arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }
        return arr3;

    }
    public static String[] merge(String[] arr1,String[] arr2){

        String[] arr3 = new String[arr1.length+ arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]= arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }
        return arr3;

    }


    public static int[] reverse(int[] arr){

        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
             reverse[j] = arr[i];
        }

        return reverse;

    }

    public static String[] reverse(String[] arr) {
        String[] reverse = new String[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {

            reverse[j] = arr[i];

        }
        return reverse;

    }

    public static double[] reverse(double[] arr) {
        double[] reverse = new double[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {

            reverse[j] = arr[i];

        }
        return reverse;

    }


    public static char[] reverse(char[] arr) {
        char[] reverse = new char[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {

            reverse[j] = arr[i];

        }
        return reverse;

    }

}
