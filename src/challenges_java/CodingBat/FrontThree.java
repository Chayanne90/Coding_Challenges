package challenges_java.CodingBat;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FrontThree {

    public static String frontThree(String str) {

        StringBuilder newstr = new StringBuilder(str);
        StringBuilder newstr2 = new StringBuilder();
        String temp;

        int strSize = str.length();

        if (str == "") {
            return "";

        } else if(strSize < 3) {

            temp = str.substring(0,strSize);
            for (int i = 0; i < 3; i++) {
                newstr2.append(temp);
            }
             return newstr2.toString();

        } else if (strSize >= 3) {
             temp = str.substring(0,3);
            for (int i = 0; i < temp.length(); i++) {
                newstr2.append(temp);
            }
        }
        return newstr2.toString();
    }

    public static void main(String[] args) {

        System.out.println(frontThree("ab"));
    }
}
