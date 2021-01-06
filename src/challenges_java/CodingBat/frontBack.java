package challenges_java.CodingBat;


/* fRONT CODINGBAT*/
public class frontBack {

    public static String swappString(String str) {

        if (str == "") {
            return "";
        } else {
            char [] chaArr = str.toCharArray();
            int maxIndex = chaArr.length -1;

            for (int i = 0; i <1 ; i++) {
                char temp = chaArr[0];
                chaArr[0] = chaArr[maxIndex];
                chaArr[maxIndex] = temp;
            }

            String newStr = String.valueOf(chaArr);
            return newStr;
        }
    }

    public static void main(String[] args) {

        System.out.println("SwappString \r " + swappString("Apple"));

    }


}
