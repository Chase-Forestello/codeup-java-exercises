package file_IO;

import java.util.ArrayList;

public class GroceryListMain {
    public static void main(String[] args) {
        // Made a new class to handle the GroceryList
        GroceryList groceryList = new GroceryList();
        // Grocery objects
        GroceryItem naranjas = new GroceryItem("Oranges", 5);
        GroceryItem tocino = new GroceryItem("Bacon", 10);
        // add items to the list
        groceryList.addGroceryItem(naranjas);
        groceryList.addGroceryItem(tocino);

        groceryList.printItems();

        groceryList.removeGroceryItem("Bacon");

        groceryList.printItems();

        groceryList.saveToFile();

    }
}
