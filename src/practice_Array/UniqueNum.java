package practice_Array;

public class UniqueNum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3, 4, 1};


        String checked = "";

        for (int i = 0; i < nums.length; i++) {

            boolean unique = true;
            if (checked.contains("" + nums[i])) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {


                if (nums[i] == nums[j]) {
                    unique = false;
                    break;

                }
            }
            if (unique) {
                System.out.println(nums[i]);
                break;
            }
            checked += nums[i];
        }


    }
}
