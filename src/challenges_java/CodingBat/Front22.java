package challenges_java.CodingBat;

public class Front22 {

    public static String front22(String str) {

        String newStr = "";
        if (str == "") {
            return "";
        } else if (str.length() <= 2 ) {
            String firstTwo1 = str.substring(0, str.length());
            newStr = firstTwo1 + str+ firstTwo1;
        } else {
            String firstTwo = str.substring(0,2);
            newStr = firstTwo + str+ firstTwo;
        }
        return newStr;
    }
    public static void main(String[] args) {

        System.out.println(front22("a"));
    }
}
