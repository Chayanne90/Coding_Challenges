package challenges_java.LeetCode;


import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.stream.events.Characters;
import java.util.*;

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

    /* 13. Roman to Integer */
    public static int romanToInt(String s) {
        HashMap<String, Integer> romanNumbers = new HashMap<String, Integer>();
        romanNumbers.put("I",1);
        romanNumbers.put("V",5);
        romanNumbers.put("X",10);
        romanNumbers.put("L",50);
        romanNumbers.put("C",100);
        romanNumbers.put("D",500);
        romanNumbers.put("M",1000);
        HashMap<String, Integer> romanNumbersRules = new HashMap<String, Integer>();
        romanNumbersRules.put("IV", 4);
        romanNumbersRules.put("IX", 9);
        romanNumbersRules.put("XL", 40);
        romanNumbersRules.put("XC", 90);
        romanNumbersRules.put("CD", 400);
        romanNumbersRules.put("CM", 900);

        int sum = 0;
        if (s.length() > 1) {
            for (int i = 0; i <= s.length() - 2; i++) {
                if (romanNumbersRules.containsKey(s.substring(i, i + 2))) {
                    sum = sum + romanNumbersRules.get(s.substring(i, i + 2));
                    i++;
                    if (i == s.length() - 2) {
                        i++;
                        sum = sum + romanNumbers.get(s.substring(i, i + 1));
                    }
                } else {
                    if (i == s.length() - 2) {
                        i++;
                        sum = sum + romanNumbers.get(s.substring(i, i + 1));
                        i--;
                    }
                    sum = sum + romanNumbers.get(s.substring(i, i + 1));
                }
            }
        } else {
            String singleNumber = Character.toString(s.charAt(0));
           return romanNumbers.get(singleNumber);
        }
        return sum;
    }



    public static String polindrome(String palindrome) {
        int count = 1;
        String Strtemp = "";
        for (int i = 0; i < palindrome.length()/2; i++) {
            if (palindrome.charAt(i) == palindrome.charAt(palindrome.length()-count)){
                Strtemp = Strtemp + palindrome.charAt(i);
            }
            count++;
        }
        Strtemp = palindrome.substring((palindrome.length()/2),palindrome.length())+Strtemp;
        return Strtemp;
    }

    /* 12. Integer to Roman
    public static String intToRoman(int num) {
        String number = String.valueOf(num);
        int tempNumber = 0;
        String romanNumberStr , ch1,ch2,prev;
        romanNumberStr = ch1 = ch2 = prev="";

        HashMap<Integer, String> romanNumbers = new HashMap<Integer, String>();
        romanNumbers.put(1,"I");
        romanNumbers.put(5,"V");
        romanNumbers.put(10,"X");
        romanNumbers.put(50,"L");
        romanNumbers.put(100,"C");
        romanNumbers.put(500,"D");
        romanNumbers.put(1000,"M");
        romanNumbers.put(4,"IV");
        romanNumbers.put(9,"IX");
        romanNumbers.put(40,"XL");
        romanNumbers.put(90,"XC");
        romanNumbers.put(400,"CD");
        romanNumbers.put(900,"CM");
        /*
        if (romanNumbers.containsKey(num)){
            return romanNumbers.get(num);
        } else {
            if (num < 4) {
                for (int j = 0; j < num; j++) {
                    romanNumberStr = romanNumberStr + romanNumbers.get(1);
                }
                System.out.println(romanNumberStr);
                return romanNumberStr;
            } else if (num >4 && num <9) {
                tempNumber = num - 5;
                romanNumberStr = romanNumberStr + romanNumbers.get(5);
                for (int j = 0; j < tempNumber; j++) {
                    romanNumberStr = romanNumberStr + romanNumbers.get(1);
                }
                System.out.println(romanNumberStr);
                return romanNumberStr;
            }
        }

        if (romanNumbers.containsKey(num)){
            System.out.println(romanNumbers.get(num));
        } else {
            for (int i = number.length()-1; i >=0; i--) {
                System.out.println(i);
                //converte Char to Integer
                int strIntNumber = Character.getNumericValue(number.charAt(i));

               // System.out.println(strIntNumber);
                //check if the current index is in the map
                if (romanNumbers.containsKey(strIntNumber)){
                    System.out.println(romanNumbers.get(strIntNumber));
                } else {

                    if (strIntNumber >= 1 && strIntNumber < 4) {
                        for (int j = 0; j < strIntNumber; j++) {
                            romanNumberStr = romanNumberStr + romanNumbers.get(1);
                        }
                        System.out.println(romanNumberStr);
                    } else if (strIntNumber > 4 && strIntNumber < 9) {
                        tempNumber = strIntNumber - 5;
                        romanNumberStr = romanNumberStr + romanNumbers.get(5);
                        for (int j = 0; j < tempNumber; j++) {
                            romanNumberStr = romanNumberStr + romanNumbers.get(1);
                        }
                        System.out.println(romanNumberStr);
                        num = num - strIntNumber;
                        number = String.valueOf(num);
                        // if the current index is not and is not nonce of teh above then increment i by 1
                    } else {
                        int strIntNumbe1r = Character.getNumericValue(number.charAt(i+1));

                        System.out.println(num);
                        i++;

                        //check if the current index is in the map
                        if (romanNumbers.containsKey(strIntNumbe1r)){
                          //  System.out.println(romanNumbers.get(strIntNumbe1r));

                        }
                    }
                }
            }
        }*/

    /* 12. Integer to Roman */
    public static String intToRoman(int num) {

        String number = String.valueOf(num);
        int tempNumber ,lastItemOfNewnumber;
        lastItemOfNewnumber = tempNumber = 0;
        String romanNumberStr= "";
        String prevNum = "";

        HashMap<Integer, String> romanNumbers = new HashMap<Integer, String>();
        romanNumbers.put(1,"I");
        romanNumbers.put(5,"V");
        romanNumbers.put(10,"X");
        romanNumbers.put(50,"L");
        romanNumbers.put(100,"C");
        romanNumbers.put(500,"D");
        romanNumbers.put(1000,"M");
        romanNumbers.put(4,"IV");
        romanNumbers.put(9,"IX");
        romanNumbers.put(40,"XL");
        romanNumbers.put(90,"XC");
        romanNumbers.put(400,"CD");
        romanNumbers.put(900,"CM");
    /*
    if (romanNumbers.containsKey(num)){
        return romanNumbers.get(num);
    } else {
        if (num < 4) {
            for (int j = 0; j < num; j++) {
                romanNumberStr = romanNumberStr + romanNumbers.get(1);
            }
            System.out.println(romanNumberStr);
            return romanNumberStr;
        } else if (num >4 && num <9) {
            tempNumber = num - 5;
            romanNumberStr = romanNumberStr + romanNumbers.get(5);
            for (int j = 0; j < tempNumber; j++) {
                romanNumberStr = romanNumberStr + romanNumbers.get(1);
            }
            System.out.println(romanNumberStr);
            return romanNumberStr;
        }
    }*/

        if (romanNumbers.containsKey(num)){
            return romanNumbers.get(num);
        } else {
            int length,newNum;
            newNum= length = 0;
            while(length < number.length()-1) {

                number = String.valueOf(num);

                for (int i = number.length()-1; i >=0; i--) {

                    int currentIndex = Character.getNumericValue(number.charAt(i));

                    if (romanNumbers.containsKey(currentIndex)) {

                        romanNumberStr = romanNumberStr +romanNumbers.get(currentIndex);
                        //System.out.println(romanNumbers.get(currentIndex));

                        newNum = num-currentIndex;
                        number = String.valueOf(newNum);
                        lastItemOfNewnumber = Character.getNumericValue(number.charAt(number.length()-1));

                        if (romanNumbers.containsKey(newNum)) {
                            romanNumberStr = romanNumbers.get(newNum) +romanNumberStr;
                            //System.out.println( romanNumberStr);
                            i--;
                        } else {
                            i--;
                        }

                    } else {
                        if (currentIndex >= 1 && currentIndex <= 4) {

                            for (int j = 0; j < currentIndex; j++) {
                                romanNumberStr = romanNumberStr + romanNumbers.get(1);
                            }


                            newNum = num-currentIndex;
                            number = String.valueOf(newNum);
                            lastItemOfNewnumber = Character.getNumericValue(number.charAt(number.length()-1));

                            if (romanNumbers.containsKey(newNum)) {
                                romanNumberStr = romanNumbers.get(newNum) +romanNumberStr;
                                //System.out.println( romanNumberStr);
                                i--;
                            } else {
                                i--;
                            }

                        } else if (currentIndex >4 && currentIndex <9) {
                            tempNumber = currentIndex - 5;
                            romanNumberStr = romanNumberStr + romanNumbers.get(5);

                            for (int j = 0; j < tempNumber; j++) {
                                romanNumberStr = romanNumberStr + romanNumbers.get(1);
                            }

                            newNum = num-currentIndex;
                            number = String.valueOf(newNum);
                            lastItemOfNewnumber = Character.getNumericValue(number.charAt(number.length()-1));

                            if (romanNumbers.containsKey(newNum)) {
                                romanNumberStr = romanNumbers.get(newNum) +romanNumberStr;
                                //System.out.println( romanNumberStr);
                                i--;
                            } else {
                                i--;
                            }



                        } else {
                            //do somthing here when current i dont exits!
                        }

                    }


                } // end for loop
                length++;
            } // end while loop
            System.out.println(romanNumberStr);
        }


        return "";
    }

    public static int[] getConcatenation(int[] nums) {

        int a[]=new int[nums.length+nums.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
           a[i] = nums[count];
            if (count == nums.length-1){
                count=0;
            } else {
                count++;
            }
        }
       return a;
    }

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    /*  26.  Remove Duplicates from Sorted Array */

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }

    /* 27. Remove Element */

    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0;
        int count =0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[count] != val){
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }

    












    public static void main(String[] args) {

        int [] num = {1,1,2};
         System.out.println("return: - >"+removeDuplicates(num));


        /*
        for ( int a: removeDuplicates(num)) {
            System.out.println(a);
        }*/
    }
}
