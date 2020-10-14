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


    /* Array-1 > commonEnd
    * Given 2 arrays of ints, a and b, return true if they have the same first element or
    * they have the same last element. Both arrays will be length 1 or more.
    */

    public static boolean commonEnd(int[] a, int[] b) {

        boolean result = false;
        if (a.length <=1 || b.length <= 1) {
            return (a[0] == b[0]);
        } else {
            for (int i = 0; i < a.length-1; i++) {
                if ((a[i] == b[i]) || (a[a.length-1] == b[b.length-1])) {
                    result = true;
                }
            }
            return result;
        }
    }

    /* Array-1 > sum3
    *  Given an array of ints length 3, return the sum of all the elements.
    */

    public static int sum3(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        return total;
    }

    /*Array-1 > rotateLeft3
    * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    */

    public static int[] rotateLeft3(int[] nums) {

        int [] tempArr = new int[nums.length];
        int temp = 0;

        for (int i = 0; i < nums.length-1; i++) {
            temp = nums[0];
            tempArr[i] = nums[i+1];
            tempArr[i+1] = temp;
        }

        return tempArr;
    }

    /* Array-1 > reverse3
    *  Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    */
    public static int[] reverse3(int[] nums) {

        int [] tempArr = new int[nums.length];
        int index = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            tempArr[i] = nums[index];
            index--;
        }

        return tempArr;
    }


    /*  Array-1 > maxEnd3
    *   Given an array of ints length 3, figure out which is larger,
    *   the first or last element in the array, and set all the other elements to be that value. Return the changed array.
    */

    public static int[] maxEnd3(int[] nums) {

        int [] myNums = new int[nums.length];
        if (nums[0] > nums[nums.length-1]) {

            for (int i = 0; i < nums.length; i++) {
                myNums[i] = nums[0];
            }
        } else {

            for (int i = 0; i < nums.length; i++) {
                myNums[i] = nums[nums.length-1];
            }
        }

        return myNums;
    }

    /* Array-1 > sum2
    *  Given an array of ints, return the sum of the first 2 elements in the array. If
    *  the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    */

    public static int sum2(int[] nums) {

        int total = 0;
        if (nums.length ==2) {
            total = nums[0] + nums[1];
        } else if (nums.length == 1){
           total = nums[0];
        } else if (nums.length == 0){
            return total;
        } else {
            for (int i = 0; i < 2; i++) {
                total = total + nums[i];
            }
        }
        return total;
    }








    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        //int [] nums2 = {7, 3};
        //System.out.println();

        for (int x :reverse3(nums) ) {
            System.out.print(x + " ");
        }

    }
}