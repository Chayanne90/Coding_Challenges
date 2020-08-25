package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Random;
import java.util.Scanner;

public class App {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int [] arrayNumber =  getInteger(5);
        for (int i = 0; i < arrayNumber.length ; i++) {
            System.out.println(" numbers you enter: " + arrayNumber[i]);
        }
        System.out.println("");
        System.out.println("The average is "+ getAvrg(arrayNumber));

    }

    public static int [] getInteger(int number) {

        System.out.println("Enter the number " + number + " integer values.\r");
        int [] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        return values;
    }

    public static double getAvrg(int [] arr) {
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        return (double) sum / (double)arr.length;
    }
}
