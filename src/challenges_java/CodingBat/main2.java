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

    /* Array-1 > middleWay
       Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements
     */

    public static int[] middleWay(int[] a, int[] b) {

        int [] myArr = new int[2];
        myArr[0] = a[a.length/2];
        myArr[1] = b[b.length/2];
        return myArr;
    }

    /* Array-1 > makeEnds
    * Given an array of ints, return a new array length 2 containing the first and last elements
    *  from the original array. The original array will be length 1 or more.
    */

    public static int[] makeEnds(int[] nums) {

        int [] myArr = new int[2];
        myArr[0] = nums[0];
        myArr[1] = nums[nums.length-1];
        return myArr;
    }

    /* Array-1 > has23
     *  Given an int array length 2, return true if it contains a 2 or a 3.
     */
    public static boolean has23(int[] nums) {

        boolean result = false;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] ==2 || nums[i] ==3){
                result = true;
            }
        }

        return result;
    }

    /* Array-1 > makeLast
    *  Given an int array, return a new array with double the length where its last element is the same
    *  as the original array, and all the other elements are 0. The original array will be length 1 or more.
    *  Note: by default, a new int array contains all 0's.
    */

    public static int[] makeLast(int[] nums) {

        int [] myArr = new int[nums.length*2];

        for (int i = 0; i <= myArr.length-1; i++) {
            if ( i == myArr.length-1) {
                myArr[i] = nums[nums.length-1];
            } else {
                myArr[i] = 0;
            }
        }
        return myArr;
    }

    /*  Array-1 > double23
    *  Given an int array, return true if the array contains 2 twice, or 3 twice.
    *  The array will be length 0, 1, or 2.
    */

    public static boolean double23(int[] nums) {

        boolean result = false;

        if (nums.length == 0 || nums.length == 1) {
            return result;
        } else if ((nums[0] == 2 && nums[1]==2) || (nums[0] == 3 && nums[1]==3) ){
            result = true;

        }
        return result;
    }

    /* Array-1 > fix23
    *  Given an int array length 3, if there is a 2 in the array
    *  immediately followed by a 3, set the 3 element to 0.
    *  Return the changed array.
    */

    public static int[] fix23(int[] nums) {

        int [] arr = new int[nums.length];

        if (nums[0] == 2 && nums[1] ==3){
            arr[0] = nums[0];
            arr[1] = 0;
            arr[2] = nums[2];
        } else if (nums[1] == 2 && nums[2] ==3){
            arr[0] = nums[0];
            arr[1] = nums[1];
            arr[2] = 0;
        } else {
            for (int i = 0; i < nums.length; i++) {

                arr[i] = nums[i];
            }
        }

        return arr;
    }

    /* Array-1 > start1
    *  Start with 2 int arrays, a and b, of any length. Return how many of
    *  the arrays have 1 as their first element.
    */

    public static int start1(int[] a, int[] b) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 ){
                count ++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1 ){
                count = count+1;
            }
        }
        return count;
    }

    /* Array-1 > biggerTwo
    *  Start with 2 int arrays, a and b, each length 2. Consider the sum of the values
    *  in each array. Return the array which has the largest sum. In event of a tie, return a.
    * */

    public static int[] biggerTwo(int[] a, int[] b) {

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < a.length; i++) {
            countA = countA + a[i];
            countB = countB + b[i];
        }

        if (countA > countB) {
            return a;
        } else  if (countB > countA) {
            return b;
        } else {
            return a;
        }
    }

    /* Array-1 > makeMiddle
    *  Given an array of ints of even length, return a new array length 2 containing the
    *  middle two elements from the original array. The original array will be length 2 or more.
    */

    public static int[] makeMiddle(int[] nums) {

        int [] myArr = new int[2];

        if (nums.length ==2) {
            myArr =  nums;
        } else {
            myArr[0] = nums[nums.length/2];
            myArr[1] = nums[nums.length/2-1];
        }

        return myArr;
    }

    /* Array-1 > plusTwo
    *  Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    */

    public static int[] plusTwo(int[] a, int[] b) {

        int [] arr = new int[a.length+b.length];

        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];

        return arr;
    }

    /*Array-1 > swapEnds
    * Given an array of ints, swap the first and last elements in the array. Return the modified array.
    * The array length will be at least 1.
    */

    public static int[] swapEnds(int[] nums) {

        int [] myArr = new int[nums.length];
        int temp1 = nums[0];
        int temp2 = nums[nums.length-1];

        for (int i = 0; i < nums.length; i++) {

           if (i == 0) {
               myArr[i] = temp2;
           } else if (i == nums.length-1) {
               myArr[i] = temp1;
           } else {
               myArr[i] = nums[i];
           }
        }
        return myArr;
    }

    /* Array-1 > midThree
    *  Given an array of ints of odd length, return a new array length 3 containing the elements
    *  from the middle of the array. The array length will be at least 3.
    */
    public static int [] midThree(int[] nums) {

        int [] myArr = new int [3];
        int count = nums.length/2-1;
        if (nums.length <= 3){
            myArr = nums;
        } else {
            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = nums[count];
                count++;
            }
        }
        return myArr;
    }

    /* Array-1 > maxTriple
    * Given an array of ints of odd length, look at the first, last, and middle values
    * in the array and return the largest. The array length will be a least 1.
    * */

    public static int maxTriple(int[] nums) {


        int first, middle, last;
        first = nums[0];
        middle = nums[nums.length/2];
        last = nums[nums.length-1];

        if ( first > middle && first > last){
            return first;
        } else if (middle > first && middle > last){
            return middle;
        } else {
            return last;
        }

    }

    /* Array-1 > frontPiece
    *  Given an int array of any length, return a new array of its first 2 elements.
    *  If the array is smaller than length 2, use whatever elements are present.
    * */

    public static int[] frontPiece(int[] nums) {

        if ( nums.length < 2){
            return nums;
        } else {
            int [] newArr = new int[2];

            newArr[0] = nums[0];
            newArr[1] = nums[1];
            return newArr;
        }
    }

    /* Array-1 > unlucky1
    *  We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    * Return true if the given array contains an unlucky 1 in the first 2 or last 2
    *  positions in the array.
    */
    public static boolean unlucky1(int[] nums) {

        boolean result = false;
        if (nums.length <= 1){
            return result;
        } else {
            for (int i = 0; i < 2; i++) {
                if (nums[i] == 1 && nums[i+1] == 3 ) {
                    result = true;
                }
            }
            for (int i = nums.length-2; i < nums.length-1; i++) {
                if (nums[i] == 1 && nums[i+1] == 3 ) {
                    result = true;
                }
            }
        }
        return result;
    }

    /* Array-1 > front11
    *  Given 2 int arrays, a and b, of any length, return a new array with the first element of
    *  each array. If either array is length 0, ignore that array.
    */

    public static int[] front11(int[] a, int[] b) {

        int [ ] myArr;
        if (a.length == 0 && b.length == 0 ) {
            return a;
        } else {

            if (a.length < b.length) {

                if (a.length ==0){
                    myArr = new int[1];
                    myArr[0] = b[0];

                } else {
                    myArr = new int[2];
                    myArr[0] = a[0];
                    myArr[1] = b[0];
                }


            } else if(b.length < a.length) {
                myArr = new int[1];
                myArr[0] = a[0];

            } else {
                myArr = new int[2];
                myArr[0] = a[0];
                myArr[1] = b[0];
            }
        }
        return myArr;
    }

    public static void main(String[] args) {
        int [] nums = {};
        int [] nums2 = {7, 9, 8};
       // System.out.println(maxTriple(nums));
       // unlucky1(nums);
       for (int x : front11(nums,nums2)) {
            System.out.print(x + " ");
       }
    }
}
