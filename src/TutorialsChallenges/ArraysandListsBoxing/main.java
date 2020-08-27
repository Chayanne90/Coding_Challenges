package TutorialsChallenges.ArraysandListsBoxing;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static Scanner in = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;
        printInstrutions();
        while (!quit) {
            System.out.println("Enter you choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 0:
                    printInstrutions();
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
                case 6:
                    processList();
                    break;
                case 7:
                    quit = false;
                    break;
            }
        }
    }

    public static void printInstrutions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list.");
        System.out.println("\t 6 - To quit the applciation \r");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item");
        groceryList.addItems(in.nextLine());
    }

    public static void modifyITem() {
        System.out.println("Enter the item you want to replace");
        String oldItem = in.nextLine();
        System.out.println("Enter replacement item");
        String newItem = in.nextLine();
        groceryList.updateGrocery(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter the item you want ot remove");
        String item = in.nextLine();
        groceryList.removeGrocery(item);
        System.out.println("Your item was remove");
    }

    public static void searchForItem() {
        System.out.println("Enter the item number");
        String searchItem = in.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found "+ searchItem+" in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the list");
        }
    }

    public static void processList() {
        /*ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(groceryList.getGroceryList());*/

        ArrayList<String> anotherArrayliostcopy = new ArrayList<String>(groceryList.getGroceryList());
    }
}
