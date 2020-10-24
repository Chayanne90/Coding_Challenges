package challenges_java.LeetCode;


import java.util.Arrays;
import java.util.HashMap;

/* Ease LeetCode challenges*/
public class Ease {

    /* 1480. Running Sum of 1d Array
    *  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    *  Return the running sum of nums.
    * example: Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
    */

    public static int[] runningSum(int[] nums) {

        int [] arr = new int[nums.length];

        int total = 0;
        arr[0] = nums[0];

        for (int i = 0; i < nums.length-1; i++) {

            if (i < 1) {
                total = nums[i] + nums[i+1];
                arr[i+1] = total;
            } else {
                total = total + nums[i+1];
                arr[i+1] = total;
            }
        }

        return arr;
    }

    /*1108. Defanging an IP Address
    * Given a valid (IPv4) IP address, return a defanged version of that IP address.
    * A defanged IP address replaces every period "." with "[.]".
    * */

    public static String defangIPaddr(String address) {

        return address.replaceAll("[^a-zA-Z0-9]", "[.]");

    }

    /* 1470. Shuffle the Array
    *  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    *  Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    */

    /*public static int[] shuffle(int[] nums, int n) {

    }*/

    /* 1. Two Sum
    * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    * You may assume that each input would have exactly one solution, and you may not use the same element twice.
    * You can return the answer in any order.
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    */

    /* This solution is not Optimize*/
    public static int[] twoSum1(int[] nums, int target) {

        int [] newArr = new int[2];
        int temp = 0;

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] + nums[i] == target && j != i) {
                    newArr[0] = j;
                    newArr[1] = i;
                    break;
                }
            }
        }
        return newArr;
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {

            result = target - nums[i];
            if (items.containsKey(result)) {
                return new int [] {items.get(result), i};
            } else {
                items.put(nums[i], i);
            }

        }
        return new int[] {};
    }

    /* 1470. Shuffle the Array
    *  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    *  Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    */

    public static int [] shuffle(int[] nums, int n) {

        int [ ] xNums = new int[n];
        int [ ] yNums = new int[nums.length-n];
        int [ ] newArr = new int [nums.length];

        for (int i = 0; i < xNums.length; i++) {
            xNums[i] = nums[i];
            yNums[i] = nums[n];
            n++;
        }

        int z =0;
        for (int a = 0; a < nums.length-1; a+=2) {

            newArr[a] = xNums[z];
            newArr[a+1] = yNums[z];
            z++;
        }
        return newArr;
    }

    /* 1528. Shuffle String
    *  Given a string s and an integer array indices of the same length.
    * The string s will be shuffled such that the character at the ith
    *  position moves to indices[i] in the shuffled string.
    *  Return the shuffled string.
    */

    public static String restoreString(String s, int[] indices) {

       char []arr = new char[indices.length];
       for (int i = 0; i < indices.length; i++) {
           arr[indices[i]] = s.charAt(i);
       }
       String str= String.copyValueOf(arr);
       return str;
    }


    public static void main(String[] args) {
        int [] arr = {4,0,2,6,7,3,1,5};
        String s = "aaiougrt";

        //restoreString(s,arr);
        System.out.println(restoreString(s,arr));

//
//        for (char i: restoreString(s,arr)) {
//            System.out.print(i+ " ");
//        }

    }

}
