package challenges_java.CodingBat;

public class main2 {

    /* Array-1 > firstLast6
    *  Given an array of ints, return true if 6 appears as either the first
    *  or last element in the array. The array will be length 1 or more.
    */

    public static boolean firstLast6(int[] nums) {

        boolean result = false;

        for (int i = 0; i < nums.length; i++) {

            if (((i == 0) && (nums[i] == 6))) {
                result = true;
            } else if((i == nums.length-1) && (nums[nums.length-1] == 6)) {
                result = true;
            }
        }
        return result;
    }


    /* Array-1 > sameFirstLast
    *  Given an array of ints, return true if the array is length 1 or more,
    * and the first element and the last element are equal.
    */
    public static boolean sameFirstLast(int[] nums) {

        return ((nums.length >= 1) && (nums[0] == nums[nums.length-1]));
    }



    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        System.out.println(firstLast6(nums));

    }
}
