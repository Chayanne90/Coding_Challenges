package challenges_java.CodingBat;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class main {

    /* Warmup-1 > startHi
    Check if the string start with "hi"*/
    public static boolean startHi(String str) {

        if (str.startsWith("hi")) {
            return true;
        } else {
            return false;
        }
    }

    /*Warmup-1 > icyHot
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.*/

    public static boolean icyHot(int temp1, int temp2) {

        if (temp1 < 0 && temp2 >100){
            return true;
        } else if (temp1 > 0 && temp2 <100) {
            return true;
        } else {
            return false;
        }
    }

    /* Warmup-1 > in1020
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

   /* Warmup-1 > hasTeen
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.*/
   public static boolean hasTeen(int a, int b, int c) {

       return ((a >= 13 && a<= 19) || (b >= 13 && b <= 19) || (c >= 13 &&  c <=19));
   }

    /*Warmup-1 > loneTeen
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
    */
    public static boolean loneTeen(int a, int b) {

        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    /* Warmup-1 > delDel
    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
    Otherwise, return the string unchanged
    */
    public static String delDel(String str) {

        if (str.length()>=4 && str.substring(1,4) == "del") {

            String firstIndex = str.substring(0,1);
            String restOfIndex = str.substring(4);
            return  firstIndex + restOfIndex;

        } else {

            return str;
        }
    }

    /* Warmup-1 > mixStart
       Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    * */

    public static boolean mixStart(String str) {

        if (str.length() < 3 || str.equals("")){
            return false;
        } else if ((str.substring(0,3).equals("mix") || (str.substring(1,3).equals("ix")))) {
            return true;
        }
        return false;
    }

    /* Warmup-1 > startOz
    *Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
    *and include the second only if it is 'z', so "ozymandias" yields "oz".
    */

    public static String startOz(String str) {

        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;

    }

    /* Warmup-1 > intMax
    * Given three int values, a b c, return the largest.
     */

    public  static int intMax(int a, int b, int c) {

        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }
        return max;
    }


    /* Warmup-1 > close10
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
    * */

    public static int close10(int a, int b) {

        int x = a -10;
        int y = b -10;

        if (Math.abs(x) != Math.abs(y)) {
            if (Math.abs(x) < Math.abs(y)) {
                return a;
            } else {
                return b;
            }
        } else {
            return 0;
        }
    }

    /* Warmup-1 > in3050
    * Given 2 int values, return true if they are both in the range 30..40 inclusive,
    * or they are both in the range 40..50 inclusive.
    */

    public static boolean in3050(int a, int b) {

        return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)));
    }

    /* Warmup-1 > max1020
    * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    * or return 0 if neither is in that range.
    */

    public static int max1020(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;

    }

    /* Warmup-1 > stringE
    *  Return true if the given string contains between 1 and 3 'e' chars.
    */

    public static boolean stringE(String str) {

        int temp = 0;
        if (str == "") {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'e') {
                    temp = temp+ 1;
                }
            }
            if (temp >= 1 && temp <=3){
                return true;
            }
            return false;
        }
    }

    /* Warmup-1 > lastDigit
    * Given two non-negative int values, return true if they have the same last digit,
    * such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    */

    public static boolean lastDigit(int a, int b) {

        return(a % 10 == b % 10);
    }

    /* Warmup-1 > endUp
    * Given a string, return a new string where the last 3 chars are now in upper case. If the string has
    * less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase
    * version of a string.
    */

    public static String endUp(String str) {

        String newStr = "";
        int check,lastFristPart;

        check = lastFristPart = 0;

        if (str.length() < 3 ) {
            newStr = str.toUpperCase();
        } else {
            for (int i = 0; i <= str.length(); i++) {
                check = str.length() - i;
                if (check == 3) {
                    newStr =  str.substring(i, str.length()).toUpperCase();
                    lastFristPart = i;
                    break;
                }
            }
        }
        newStr = str.substring(0,lastFristPart) + newStr;
        return newStr ;
    }

    /* Warmup-1 > everyNth
       Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth
        char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more
    */

    public static String everyNth(String str, int n) {

        StringBuilder buildStr = new StringBuilder();
        String newStr = "";
        buildStr.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (i % n == 0) {
                buildStr.append(str.charAt(i));
            }
        }
        newStr = buildStr.toString();
        return newStr;
    }

    /* Warmup-2 > stringTimes
    *  Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    */

    public static String stringTimes(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newStr.append(str);
        }
        String strnew = newStr.toString();
        return strnew;
    }

    /* Warmup-2 > frontTimes
    * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever
    * is there if the string is less than length 3. Return n copies of the front;
    */

    public static String frontTimes(String str, int n) {

        StringBuilder st = new StringBuilder();
        String newStr = "";

        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                st.append(str);
            }
        } else {
            for (int i = 0; i < n; i++) {
                st.append(str.substring(0,3));
            }
        }
        newStr = st.toString();
        return newStr;
    }

    /* Warmup-2 > countXX
    *  Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    */
     public static int countXX(String str) {

         int amount= 0;
         for (int i =0; i< str.length()-1; i++) {

             if (str.substring(i, i+2).equals("xx")) {
                 amount  = 1 + amount;
             }
         }
         return amount;
    }

    /* Warmup-2 > doubleX
    *  Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    */

    public static boolean doubleX(String str) {

        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }

        if (i+1 >= str.length()){
            return false;
        }
        return str.substring(i+1, i+2).equals("x");
    }

    /* Warmup-2 > stringBits
     *  Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     */

    public static String stringBits(String str) {

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i % 2 ==0) {
                st.append(str.charAt(i));
            }
        }
        String newstr = st.toString();
        return newstr;
    }

    /* Warmup-2 > stringSplosion
    *  Given a non-empty string like "Code" return a string like "CCoCodCode".
    */

    public static String stringSplosion(String str) {

        String result = "";
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;

    }

    /* Warmup-2 > last2
    * Given a string, return the count of the number of times that a substring length 2 appears in the
    * string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    */

    public static String last2(String str) {

        return str.substring(2);

    }


    /* Warmup-2 > arrayCount9
     * Given an array of ints, return the number of 9's in the array.
     */

    public int arrayCount9(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                count++;
            }
        }
        return count;
    }

    /* Warmup-2 > arrayFront9
    *  Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    *  The array length may be less than 4
    * */

    public static boolean arrayFront9(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4){
                return true;
            }
        }

        return false;
    }

    /* Warmup-2 > array123
    *  Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    */

    public static boolean array123(int[] nums) {

        if (nums.length <3) {
            return false;
        } else {
            for (int i = 0; i < nums.length-1; i++) {

                if (nums[i] == 1 && nums[i+1]==2 && nums[i+2]==3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Warmup-2 > stringMatch
    *  Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    *  So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    */

    public static int stringMatch(String a, String b) {

        int len = Math.min(a.length(), b.length());
        int count =0;

        for (int i = 0; i < len-1; i++) {

            if (a.substring(i, i+2).equals(b.substring(i,i+2))) {
                count++;
            }

        }

        return count;
    }

    /* Warmup-2 > stringX
    * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or
    *  end should not be removed.
    */

    public static String stringX(String str) {

        String result = "";
        for (int i=0; i<str.length(); i++) {

            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;

    }

    /* Warmup-2 > altPairs
    *  Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    */

    public static String altPairs(String str) {

        if (str.equals("")) {
            return str;
        } else {
            StringBuilder st = new StringBuilder();
            boolean boo = true;
            int count = 0;
            st.append(str.charAt(count));

            for (int i = 0; i < str.length() - 1; i++) {

                if (boo == true) {
                    count = count + 1;
                    if (count < str.length()) {
                        st.append(str.charAt(count));
                    }

                    boo = false;
                } else {
                    count = count + 3;
                    if (count < str.length()) {
                        st.append(str.charAt(count));
                    }
                    boo = true;
                }

            }
            String newStr = st.toString();
            return newStr;
        }
    }

    /*Warmup-2 > stringYak
    * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    * but the "a" can be any char. The "yak" strings will not overlap.
    */

    public static String stringYak(String str) {

        String newStr = str.replaceAll("yak", "");
        return newStr;
    }


    /* Warmup-2 > array667
        Given an array of ints, return the number of times that two 6's are next to each other in the array.
        Also count instances where the second "6" is actually a 7.
    *
    */

    public static int array667(int[] nums) {

        int count =0;
        for (int i = 0; i < nums.length-1; i++) {

            if ((nums[i] == 6 && nums[i+1] ==6) || (nums[i] == 6 && nums[i+1] ==7)){
                count++;
            }
        }
        return count;
    }

    /* Warmup-2 > noTriples
    * Given an array of ints, we'll say that a triple is a value appearing 3
    * times in a row in the array. Return true if the array does not contain any triples.
    * */

    public static boolean noTriples(int[] nums) {


        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }

    /* Warmup-2 > has271
    * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed
    * by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    */

    public static boolean has271(int[] nums) {

//        boolean result = false;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == 2 && nums[i+1] == 7 && nums[i+2] == 1){
//                result =  true;
//            }
//        }

        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&              // the "7" check
                    Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
                return true;
            }
        }

        // If we get here ... none found.
        return false;
    }

    /* String-1 > makeTags
    * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i"
    * tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with
    * tags around the word, e.g. "<i>Yay</i>".
    */
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    /* String-1 > makeOutWord
    *  Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle
    *  of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and
    * going up to but not including index j
    */

    public static String makeOutWord(String out, String word) {

        return out.substring(0,2)+word+out.substring(2,out.length());
    }

    /* String-1 > extraEnd
    *  Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    * The string length will be at least 2.
    */

    public static String extraEnd(String str) {

        String newStr ="";
        if (str.length() < 2) {

            for(int i =0; i < 3; i++) {
                newStr = newStr+ str;
            }
        } else {

            for(int i =0; i < 3; i++) {
                newStr = newStr+ str.substring(str.length()-2, str.length());
            }
        }
        return newStr;
    }

    /* String-1 > firstTwo
    *  Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
    * yields the empty string "". Note that str.length() returns the length of a string.
    */

    public static String firstTwo(String str) {

        String newStr = "";

        if (str.length()< 2 || str == ""){
            newStr = str;
        } else {
            newStr = str.substring(0,2);
        }

      return newStr;
    }

    /* String-1 > firstHalf
        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    */

    public static String firstHalf(String str) {

        String newStr = "";

        if (str.length() % 2 ==0) {

            newStr = str.substring(0,str.length()/2);
        }
        return newStr;
    }

    /* String-1 > withoutEnd
    *  Given a string, return a version without the first and last char, so "Hello" yields "ell".
    *  The string length will be at least 2.
    * */
    public static String withoutEnd(String str) {

        String newStr = "";
        if (str.length()< 2){
            newStr= str;
        } else {
            newStr = str.substring(1, str.length()-1);
        }

        return newStr;
    }

    /*String-1 > comboString
    * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
    * on the outside and the longer string on the inside. The strings will not be the same length,
    * but they may be empty (length 0).
    */

    public static String comboString(String a, String b) {

        String newStr = "";

        if (a.length() < b.length()){
            newStr  = a+b+a;
        } else {
            newStr  = b+a+b;
        }
        return newStr;
    }

    /* String-1 > nonStart
    *  Given 2 strings, return their concatenation, except omit the first char of each.
    *  The strings will be at least length 1.
    *  */

    public static String nonStart(String a, String b) {

        String newStr = "";
        if (a.length() <= 1 && b.length() <=1) {

            newStr = "";
        } else {

            newStr = a.substring(1,a.length())+b.substring(1,b.length());
        }
        return newStr;
    }

    /* String-1 > left2
    *  Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    *  The string length will be at least 2.
    */

    public static String left2(String str) {

        String newStr = "";
        if (str.length() <2){
            newStr = str+str;
        } else {
            newStr = str.substring(str.length()-2, str.length())+str.substring(0,str.length()-2);
        }

        return newStr;
    }

    /* String-1 > theEnd
    *  Given a string, return a string length 1 from its front, unless front is false, in which case return a
    *  string length 1 from its back. The string will be non-empty.
    */

    public static String theEnd(String str, boolean front) {

        String newStr="";
        if (front) {
            newStr = str.substring(0,1);
        } else {
            newStr = str.substring(str.length()-1,str.length());
        }
        return newStr;
    }

    /* String-1 > withouEnd2
    *  Given a string, return a version without both the first and last char of the string.
    * The string may be any length, including 0.
    */

    public static String withouEnd2(String str) {

        String newStr="";
        if(str.length()<=2) {
            newStr = "";
        } else {
            newStr = str.substring(1,str.length()-1);
        }

        return newStr;
    }

    /* String-1 > middleTwo
    *  Given a string of even length, return a string made of the middle two chars, so the string
    *  "string" yields "ri". The string length will be at least 2.
    */

    public static String middleTwo(String str) {

        String newStr="";
        int middle = str.length()/2;
        if (str.length() <=2) {
            newStr = "";
        } else {
            newStr = str.substring(middle-1,middle+1);
        }
        return newStr;
    }

    /* String-1 > endsLy
    *  Given a string, return true if it ends in "ly".
    */
    public static boolean endsLy(String str) {
        boolean result = false;
        if (str.length() <=1 || str == " ") {
            result = false;
        } else if ((str.substring(str.length()-2,str.length()).equals("ly"))){
            result = true;
        }
        return result;
    }


    /* String-1 > nTwice
    *  Given a string and an int n, return a string made of the first and last n chars
    *  from the string. The string length will be at least n.
    */
    public static String nTwice(String str, int n) {

        return str.substring(0, n)+str.substring(str.length()-n,str.length());
    }


    /* Map-1 > mapBully
    *  Modify and return the given map as follows: if the key "a" has a value, set the key "b"
    * to have that value, and set the key "a" to have the value "". Basically "b" is a bully,
    * taking the value and replacing it with the empty string.
    */

    public static Map<String, String> mapBully (Map<String, String> map) {

        if (map.containsKey("a")) {

            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /* Map-1 > mapShare
    *  Modify and return the given map as follows: if the key "a" has a value, set the key "b"
    *  to have that same value. In all cases remove the key "c", leaving the rest of the map
    *  unchanged.
    */

    public static Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }

    /* Map-1 > mapAB
    *  Modify and return the given map as follows: for this problem the map may or may not contain
    *  the "a" and "b" keys. If both keys are present, append their 2 string values together and
    *  store the result under the key "ab".
    */

    public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }

    /* Map-1 > topping1
    *  Given a map of food keys and topping values, modify and return the map as follows: if the
    *  key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread"
    *  to have the value "butter".
    */

    public static Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread","butter");
        return map;
    }

    /* Map-1 > topping2
    *  Given a map of food keys and their topping values, modify and return the map as follows:
    *  if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If
    *  the key "spinach" has a value, change that value to "nuts".
    */

    public static Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    /* Map-1 > topping3
    *  Given a map of food keys and topping values, modify and return the map as follows:
    *  if the key "potato" has a value, set that as the value for the key "fries". If the
    *  key "salad" has a value, set that as the value for the key "spinach".
    */

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    /* Map-1 > mapAB2
    *  Modify and return the given map as follows: if the keys "a" and "b" are both
    *  in the map and have equal values, remove them both.
    */

    public static Map<String, String> mapAB2(Map<String, String> map) {

        if ((map.containsKey("a") && map.containsKey("b") && (map.get("a").equals(map.get("b"))))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    /*Map-1 > mapAB3
    * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a
    *  value in the map (but not both), set the other to have that same value in the map.
    */

    public static Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey("a") && !(map.containsKey("b") && map.containsKey("a"))){
            map.put("b",map.get("a"));
        } else if (map.containsKey("b") && !(map.containsKey("b") && map.containsKey("a"))) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    /* Map-1 > mapAB4
    *  Modify and return the given map as follows: if the keys "a" and "b" have values that have
    *  different lengths, then set "c" to have the longer value. If the values exist and have the
    *  same length, change them both to the empty string in the map.
    */

    public static Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) if (map.get("a").length() == map.get("b").length()) {

            map.put("a", "");
            map.put("b", "");

        } else if (map.get("a").length() > map.get("b").length()) {

            map.put("c", map.get("a"));
        } else {
            map.put("c", map.get("b"));
        }
        return map;
    }

    /* Map-2 > word0
    *  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    *  always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting
    *  later, but for this problem the value is simply 0.
    */

    public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> myMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            myMap.put(strings[i], 0);
        }

        return myMap;
    }

    /* Map-2 > wordLen
    *  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    *  and the value is that string's length.
    */

    public static Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> myMap = new HashMap<>();

            if (strings.length ==1  ) {
                myMap.put(strings[0], strings[0].length());
            } else {
                for (int i = 0; i < strings.length-1; i++) {
                    if (strings[i] != strings[i+1]) {
                        myMap.put(strings[i], strings[i].length());
                        myMap.put(strings[i+1],strings[i+1].length());
                    }
                }
            }

        return myMap;
    }

    /* Map-2 > pairs
     * Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its
     * first character as a key with its last character as the value.
     */

    public static Map<String, String> pairs(String[] strings) {
        
        Map<String, String> myMap = new HashMap<>();
        for (int i = 0; i < strings.length-1; i++) {
            if (strings[i].substring(0,1) != strings[i+1].substring(0,1)) {

                myMap.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1,strings[i].length()));
                myMap.put(strings[i+1].substring(0,1), strings[i+1].substring(strings[i+1].length()-1,strings[i+1].length()));
            }
        }
        return myMap;
    }

    /* Map-2 > wordCount
    *  The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
    *  different string, with the value the number of times that string appears in the array.
    */

    public static  Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> myMap= new HashMap<>();
        int index, count;
        count = index = 0;

        while (index < strings.length) {
            count = 0;

            for (int i = 0; i < strings.length; i++) {
                if (strings[index].equals(strings[i])) {
                    count++;
                    myMap.put(strings[index], count);
                }
            }
            index++;
        }
        return myMap;
    }

    /* Map-2 > firstChar
    * Given an array of non-empty strings, return a Map<String, String> with a key for every
    * different first character seen, with the value of all the strings starting with that character
    * appended together in the order they appear in the array.
    *
    * EXAMPLE:
    * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
      firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
      firstChar([]) → {}

     */

    public static Map<String, String> firstChar(String[] strings) {

        Map<String, String> myMap = new HashMap<>();
        for (String word: strings) {
            if (!myMap.containsKey(word.substring(0,1))) {
                myMap.put(word.substring(0,1), word);
            }  else {
               String temp = myMap.get(word.substring(0,1));
               myMap.put(word.substring(0,1), temp+word);
            }
        }
        return myMap;
    }

    /* Map-2 > wordMultiple
    *  Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value
    *  is true if that string appears 2 or more times in the array.
    */

    public static Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> myMap = new HashMap<>();
        int index, count;
        count = index = 0;

        while (index < strings.length) {
            count = 0;

            for (int i = 0; i < strings.length; i++) {
                if (strings[index].equals(strings[i])) {
                    count++;
                    if (count > 1) {
                        myMap.put(strings[index], true);
                    } else {
                        myMap.put(strings[index], false);
                    }
                }
            }
            index++;
        }
        return myMap;
    }


    /* Map-2 > wordAppend
     *  Loop over the given array of strings to build a result string like this: when a string appears
     *  the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty
     *  string if no string appears a 2nd time.
     */

    public static String wordAppend(String[] strings) {

        int count, index;
        String newStr = "";
        StringBuilder st = new StringBuilder();
        count = index = 0;

        while (index < strings.length) {

            for (int i = 0; i < strings.length; i++) {

                if ((strings[index].equals(strings[i]))) {

                    newStr = strings[index];
                }
            }

            index++;
        }
//        newStr = newStr.substring(0,newStr.length()/2);
//        System.out.println(newStr);
        return newStr.substring(0,newStr.length()/2);
    }

    public static void main(String[] args) {

        String [] arr = {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"};
        System.out.println(wordAppend(arr));
       // wordAppend(arr);
    }
}
