package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Scanner;

public class main {

    private static Scanner in = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;
        printInstrutions();
        while (!quit) {
            System.out.println("enter you choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.getGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyITem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
            }
        }
    }
}
