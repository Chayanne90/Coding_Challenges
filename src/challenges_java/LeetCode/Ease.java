package challenges_java.LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

    /* 1512. Number of Good Pairs
    *  Given an array of integers nums.
    *  A pair (i,j) is called good if nums[i] == nums[j] and i < j.
    *  Return the number of good pairs.
    */

    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    temp++;
                }
            }
           count = count + temp;
        }
      return count;
    }

    /* 1365. How Many Numbers Are Smaller Than the Current Number
    *  Given the array nums, for each nums[i] find out how many
    * numbers in the array are smaller than it. That is, for each
    * nums[i] you have to count the number of valid j's such that
    * j != i and nums[j] < nums[i].
    * Return the answer in an array.
    */

    public static int [] smallerNumbersThanCurrent(int[] nums) {

        int count = 0;
        int [] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((j != i) && (nums[j] < nums[i])) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    /* 1486. XOR Operation in an Array
     * Given an integer n and an integer start.
     * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
     * Return the bitwise XOR of all elements of nums.
     */

    public static int xorOperation(int n, int start) {

        int [ ] nums = new int[n];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
            result = result ^ nums[i];
        }
       return result;
    }


    /* 1672. Richest Customer Wealth
    *  You are given an m x n integer grid accounts where accounts[i][j] is
    *  the amount of money the ith customer has in the jth bank. Return the
    *  wealth that the richest customer has.
    *  A customer's wealth is the amount of money they have in all their bank accounts.
    *  The richest customer is the customer that has the maximum wealth.
    */

    public static int maximumWealth(int[][] accounts) {

        int total, temp;
        temp = total = 0;

        for (int i = 0; i < accounts.length; i++) {
            total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total = total + accounts[i][j];
            }
            if (temp < total) {
                temp = total;
            }
        }
        return temp;
    }

    /* 560. Subarray Sum Equals K
     * Given an array of integers nums and an integer k, return the
     * total number of continuous subarrays whose sum equals to k.
     */

    public static int subarraySum(int[] nums, int k) {

        int count, temp;
        count = temp = 0;

        for (int i = 0; i < nums.length; i++) {
            count  = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] + nums[j] == k) {
                    count++;
                }
            }
            if (temp < count) {
                temp = count;
            }
        }
        return temp;
    }

    /* 1431. Kids With the Greatest Number of Candies
    *  Given the array candies and the integer extraCandies, where
    *  candies[i] represents the number of candies that the ith kid has.
    * For each kid check if there is a way to distribute extraCandies among
    * the kids such that he or she can have the greatest number of candies
    * among them. Notice that multiple kids can have the greatest number of candies.
    * */

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> myList = new ArrayList<Boolean>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {

            // find the greatest number
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] + extraCandies;
            if (temp >=  max ) {
                myList.add(true);
            } else {
                myList.add(false);
            }
        }
        return myList;
    }

    /* 1678. Goal Parser Interpretation
    *  You own a Goal Parser that can interpret a string command.
    *  The command consists of an alphabet of "G", "()" and/or "(al)" in
    *  some order. The Goal Parser will interpret "G" as the string "G", "()" as
    *  the string "o", and "(al)" as the string "al". The interpreted strings are
    *  then concatenated in the original order.
    *  Given the string command, return the Goal Parser's interpretation of command.
    * */

    public static String interpret(String command) {

        String newStr = "";
        for (int i = 0; i <= command.length()-1; i++) {
            if ( command.charAt(i)== 'G') {
                newStr += "G";
            } else if ((command.charAt(i) == '(') && (command.charAt(i+1) == ')')) {
                newStr += "o";
            } else if((command.charAt(i) == '(') && (command.charAt(i+1) == 'a')) {
                newStr += "al";
            }
        }
      return newStr;
    }


    /* 1313. Decompress Run-Length Encoded List
    *  We are given a list nums of integers representing a
    *  list compressed with run-length encoding. Consider each
    *  adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
    *  For each such pair, there are freq elements with value val concatenated in
    *  a sublist. Concatenate all the sublists from left to right to generate
    * the decompressed list. Return the decompressed list.
    * */

    public static int[] decompressRLElist(int[] nums) {

        int freq = 0;
        int [] newArr1 = new int[0];
        int [] newArr2 = new int[0];

        for (int i = 0; i < nums.length-1; i += 2) {

            freq = nums[i];
            int val = nums[i+1];
            if (freq > 1) {
                newArr2 = new int[freq];
                for (int j = 0; j < freq; j++) {
                    newArr2[j] = val;
                }

            } else {
                newArr1 = new int[freq];
                for (int j = 0; j < freq; j++) {
                    newArr1[j] = val;
                }
            }
        }

        int []newArr3 = new int [newArr1.length+newArr2.length];
        System.out.println(newArr1.length+newArr2.length);
        for (int j = 0; j < newArr1.length; j++) {
            newArr3[j] = newArr1[j];
        }
        for (int x = 0; x < newArr2.length; x++) {
            newArr3[x+1] = newArr2[x];
        }


        return newArr3;
    }

    /*  1221. Split a String in Balanced Strings
    *   Balanced strings are those that have an equal
    *   quantity of 'L' and 'R' characters. Given a balanced string s,
    *   split it in the maximum amount of balanced strings.Return the
    *   maximum amount of split balanced strings.
    */

    public static int balancedStringSplit(String s) {

        int amountL = 0;
        int amountR = 0;
        int balance = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L') {
                amountL += 1;
            } else if (s.charAt(i)=='R'){
                amountR += 1;
            }
            if (amountL == amountR){
               balance +=1;
            }
        }
        return balance;
    }


    public static void sameAlphaNum(String str1, String str2) {

        String [] arr1 = str1.split(" ");
        String [] arr2 = str2.split(" ");
        String sameValues="";

        if (arr1.length > arr2.length) {
            boolean swi = true;
            while (swi) {
                for (int i = 0; i < arr2.length; i++) {
                    if (arr2[i].equals(arr1[i])) {
                        sameValues = arr2[i];
                        System.out.println(arr2[i]);
                    }
                }
            }

            /*
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i].equals(arr1[i])) {
                    sameValues = arr2[i];
                    System.out.println(arr2[i]);
                }
            }

            for (int i = arr2.length-1; i < arr1.length; i++) {
                if (arr2[i] == arr1[i]){
                    sameValues = arr2[i];
                    System.out.println(sameValues);
                }
            }*/

        }
    }



    /* 771. Jewels and Stones
    * You're given strings jewels representing the types of stones that are jewels,
    *  and stones representing the stones you have. Each character in stones is a
    *  type of stone you have. You want to know how many of the stones you have are
    *  also jewels. Letters are case sensitive, so "a" is considered a different type
    * of stone from "A".
    * */

    public static int  numJewelsInStones(String J, String S) {

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)){
                    count +=1;
                }
            }
        }
        //System.out.println(count);
        return count;
    }



    /* 1281. Subtract the Product and Sum of Digits of an Integer
    *  Given an integer number n, return the difference between
    * the product of its digits and the sum of its digits.
    */

    public static int subtractProductAndSum(int n) {

        String number = String.valueOf(n);
        int product = 1;
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            String s = String.valueOf(number.charAt(i));
            int num = Integer.valueOf(s);
            product = product * num;
        }
        for (int x = 0; x < number.length(); x++) {
            String s = String.valueOf(number.charAt(x));
            int num = Integer.valueOf(s);
            sum = sum + num;
        }
        return product - sum;
    }

    /*1880. Check if Word Equals Summation of Two Words */
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        String [] alphaBetArr = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m","n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


        String target, firstW, secondW;
        target= firstW= secondW="";

       for (int i = 0; i <= targetWord.length()-1; i++) {
            for (int j = 0; j < alphaBetArr.length; j++) {
                if (targetWord.charAt(i) == alphaBetArr[j].charAt(0)) {
                    target = target+j;
                }
            }
        }

        for (int i = 0; i < firstWord.length(); i++) {
            for (int j = 0; j < alphaBetArr.length; j++) {
                if (firstWord.charAt(i) == alphaBetArr[j].charAt(0)) {
                    firstW = firstW+j;
                }
            }
        }

        for (int i = 0; i < secondWord.length(); i++) {
            for (int j = 0; j < alphaBetArr.length; j++) {
                if (secondWord.charAt(i) == alphaBetArr[j].charAt(0)) {
                    secondW = secondW+j;
                }
            }
        }

        Integer oneWord, twoWord,mainWord;
        oneWord = twoWord =mainWord =0;

        if (firstW.charAt(0) =='0' && firstWord.length()>1){
            firstW = firstW.substring(1,firstW.length());
            oneWord=Integer.valueOf(firstW);
        } else {
            oneWord=Integer.valueOf(firstW);
        }

        if (secondW.charAt(0) =='0' && secondWord.length()>1) {
            secondW = secondW.substring(1,secondW.length());
             twoWord=Integer.valueOf(secondW);
        } else {
            twoWord=Integer.valueOf(secondW);
        }

        if (target.charAt(0) =='0' && targetWord.length()>1){
            target = target.substring(1,target.length());
             mainWord=Integer.valueOf(target);
        } else {
            mainWord=Integer.valueOf(target);
        }

        int total = oneWord+twoWord;
        return total == mainWord;

    }



    /* 1869. Longer Contiguous Segments of Ones than Zeros */
    public static boolean checkZeroOnes(String s) {

        int countOnes, countZeros, temp0,temp1;
        countOnes = countZeros=temp0=temp1=0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                temp1+=1;
                if (temp1 >countOnes ) {
                    countOnes = temp1;
                }
                temp0 =0;
            } else {
                temp0+=1;
                if (temp0 >countZeros ) {
                    countZeros = temp0;
                }
                temp1 =0;
            }
        }
        return countOnes > countZeros;
    }


    
    public static void main(String[] args) {

        String s = "1";

        //checkZeroOnes(s);
        System.out.println( checkZeroOnes(s));

    }




}
