package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Arrays;
import java.util.Scanner;

public class App2 {

    public static Scanner in = new Scanner(System.in);

    /* Get Integers */
    public static int[] getArray(int size) {
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

    /*sort array*/
    public static int[] getSortedArr(int [] arr) {

        int [] sortArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortArr[i] = arr[i];
        }

        boolean trigger = true;
        int temp;
        while (trigger) {
            trigger = false;
            for (int i = 0; i < sortArr.length - 1; i++) {

                if (sortArr[i] < sortArr[i+1]) {
                    temp = sortArr[i];
                    sortArr[i] = sortArr[i+1];
                    sortArr[i+1] = temp;
                    trigger = true;
                }
            }
        }
        return sortArr;
    }

    public static void main(String[] args) {

        System.out.println("Please enter the size of the array. \r");
        int size = in.nextInt();
        int [] arr = getArray(size);

        System.out.println("This is your array unsorted");
        printArr(arr);

        System.out.println("This is you array sorted");
        int [] sortedArr = getSortedArr(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println("Index " +sortedArr[i] +" -> "+ sortedArr[i]);
        }




    }
}
