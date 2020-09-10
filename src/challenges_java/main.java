package challenges_java;

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





    public static void main(String[] args) {

        System.out.println(lastDigit(17,7));
    }

}
