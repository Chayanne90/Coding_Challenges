package challenges_java.CodingBat;

public class main3 {

    /*Logic-1 > cigarParty*/
    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if ((cigars >= 40 && cigars <= 60) && !isWeekend){
            return true;
        } else if((cigars >= 40 && cigars <= 60) && isWeekend){
            return true;
        } else if (cigars > 60 && isWeekend){
            return true;
        }
        return false;
    }

    /* Logic-1 > dateFashion */
    public int dateFashion(int you, int date) {

        if ((you >= 8 && you<= 10) || (date >= 8 && date<= 10) ){
            return 2;
        } else if (you <= 2 || date <= 2){
            return 0;
        }
        return 1;
    }

    /* Logic-1 > squirrelPlay */
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >=60 && temp <=90 && !isSummer){
            return true;
        } else if (isSummer && temp >=60 && temp <=100 ){
            return true;
        }
        return false;
    }

    /* Logic-1 > caughtSpeeding */
    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday){
            if (speed <=60){
                return 0;
            } else if (speed >=61 && speed <=80){
                return 1;
            } else if(speed >=81){
                return 0;
            }
        } else {
            if (speed <=60){
                return 0;
            } else if (speed >=61 && speed <=80){
                return 1;
            } else if(speed >=81){
                return 2;
            }
        }
        return 1;
    }

    /* Logic-1 > sortaSum */
    public static int sortaSum(int a, int b) {

        return a+b >=10 && a+b <=19 ? 20 : a+b;
    }











    public static void main(String[] args) {

    }
}
