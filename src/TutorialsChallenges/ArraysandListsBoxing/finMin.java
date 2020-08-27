package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Arrays;
import java.util.Scanner;

public class finMin {

    private static Scanner in = new Scanner(System.in);

    /* Get Integers */
    public static int[] getArray(int size) {

        int [] arr  = new int[size];

        for (int i = 0; i <arr.length; i++) {
            System.out.println("Please enter the number:");
            int num = in.nextInt();
            in.nextLine();
            arr[i] = num;
        }
        return arr;
    }

    public static int findMin(int [] arr) {


        boolean trigger = true;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
                int x = arr[i];
            if (arr[i] < temp){
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        System.out.println("Please enter the size of the array");
        int size = in.nextInt();
        in.nextLine();

        int [ ] arr = getArray(size);
        System.out.println("the min in teh array is: " + Arrays.toString(arr));
        int num = findMin(arr);
        System.out.println("The min num in the array is " + num);


    }
}
