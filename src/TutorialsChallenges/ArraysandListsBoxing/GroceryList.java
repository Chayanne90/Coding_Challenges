package TutorialsChallenges.ArraysandListsBoxing;

import java.util.ArrayList;

public class GroceryList {

    private  static ArrayList<String> groceryList = new ArrayList<String>();

    public void addItems (String item) {

        groceryList.add(item);
    }
    
    public  void getGrocery() {

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.print(groceryList.get(i)+ " -> ");
        }
    }

    public  void updateGrocery(String oldItem, String newItem) {

        int index = groceryList.indexOf(oldItem);
        groceryList.set(index, newItem);
        System.out.println("Goocery item " + (index+1)+ " has been modified");
    }

    public  void removeGrocery(String item) {

        int theItem = groceryList.indexOf(item);
        groceryList.remove(item);
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
