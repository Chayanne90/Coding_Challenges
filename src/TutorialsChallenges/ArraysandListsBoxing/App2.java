package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Scanner;

public class App2 {

    public static Scanner in = new Scanner(System.in);

    /* Get Integers */
    public int[] getArray(int size) {
        System.out.println("Please enter the number: .\r");
        int [] arr  = new int[size];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    /* print array */
    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i + " -> " + arr[i]);
        }
    }

    public static void main(String[] args) {

    }


}
