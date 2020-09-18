package challenges_java.LeetCode;


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

        address = address.replaceAll("[^a-zA-Z0-9]", "[.]");
        return address;

    }

    public static void main(String[] args) {

        System.out.println(defangIPaddr("255.100.50.0"));

    }

}
