package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Scanner;

public class App3 {

    private static Scanner in = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone("646-987-2504");

    public static void main(String[] args) {


        boolean quit = false;
        System.out.println("Starting Phone....");
        printActions();
        while (!quit) {



        }

    }

    private static void printActions() {
        System.out.println("\n Available Astions: \npress");
        System.out.println("0 - Shutdown\n"+
                           "1 - Print Contact\n"+
                           "2 - Add Contact\n" +
                           "3 - Update Contact\n "+
                           "4 - Romove Contact\n "+
                           "5 - Query Existiing Contact\n "+
                           "6 - Print Actions ");
    }


}
