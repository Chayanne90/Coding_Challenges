package challenges_java.CodingBat;

public class BackAround {

    public static String backAround(String str) {

        int lastChar = str.length()-1;
        char  character = str.charAt(lastChar);
        String newStr = String.valueOf(character);
        return newStr + str + newStr;

    }

    public static void main(String[] args) {
        System.out.println(backAround("a"));
    }
}
