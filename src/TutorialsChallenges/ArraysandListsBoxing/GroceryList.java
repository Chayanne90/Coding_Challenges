package TutorialsChallenges.ArraysandListsBoxing;

import java.util.ArrayList;

public class GroceryList {

    private  static ArrayList<String> groceryList = new ArrayList<String>();


    public static void addItems (String item) {
        groceryList.add(item);
    }
    
    public static void getGrocery() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.print(groceryList.get(i)+ " -> ");
        }
    }

    public static void updateGrocery(int index, String item) {

        groceryList.set(index, item);
        System.out.println("Goocery item " + (index+1)+ " has been modifie");
    }

    public static void removeGrocery(int index) {

       // String theItem = groceryList.get(index);
        groceryList.remove(index);
    }


    public String findItem(String item) {

        boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);

        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }
}
