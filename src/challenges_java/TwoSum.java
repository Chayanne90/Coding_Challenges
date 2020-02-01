package challenges_java;

import java.util.Arrays;

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

        int x = 0;

        int [] arr = new int[x];

        for(int i = 0; i <= nums.length-1; i++) {

            x++;
            int total = nums[i] + nums[x];

            if( total == target) {

                arr = new int[] {i, x};

                break;

            }

        }
        return arr;
    }

    public static void main(String [ ] args) {

        int [] nums;
        nums = new int[] {3,2,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
