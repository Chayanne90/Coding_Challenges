package challenges_java;

public class TwoSum {

    /*Tow sum challenge by chayanne from LeetCode
    *
    * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].

    */


    public static int[] twoSum(int[] nums, int target) {

        int [] arr = new int[4];
        int y = 1;
        for(int i = 0; i <= nums.length-1; i++) {

            int x = nums[i] + nums[y];

            if(x == target) {

                arr[i] = nums[i];
            }
        }
        return arr;
    }

    public static void main(String [ ] args) {

        int [] nums;
        nums = new int[] {2,7,11,15};

        //int [] r = twoSum(nums,9);

        System.out.println(twoSum(nums,9));
    }
}
