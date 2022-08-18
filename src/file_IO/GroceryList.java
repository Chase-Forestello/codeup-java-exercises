package file_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private ArrayList<GroceryItem> groceryItems;

    public GroceryList() {
        groceryItems = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem item) {
        groceryItems.add(item);
    }

    public void printItems() {
        System.out.println("My Grocery List");
        for (GroceryItem item : groceryItems) {
            System.out.println(item);
        }
    }

    public void removeGroceryItem(String itemName) {
        // find index of item with itemName
        int index = getIndexOfItemByName(itemName);
        // remove te item at that index
        if (index > -1) {
            groceryItems.remove(index);
        }
    }

    private int getIndexOfItemByName(String itemName) {
        int index = -1;
        for (int i = 0; i < groceryItems.size(); i++) {
            GroceryItem item = groceryItems.get(i);
            String itemNameInList = item.getName();
            if (itemNameInList.equalsIgnoreCase(itemName)) {
                // item is found so save its index
                index = i;
            }
        }
        return index;
    }

    //    public void saveToFile() {
//        // Make path object
//        Path file = makeFileAndDirectory();
//        List<String> tempItems = new ArrayList<>();
//        for (GroceryItem item : groceryItems) {
//            tempItems.add(item.toString());
//        }
//        try {
//            assert file != null;
//            Files.write(file, tempItems);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private Path makeFileAndDirectory() {
//        try {
//
//            Path groceryFolder = Paths.get("/Users", "chase", "Codeup", "codeup-java-exercises", "src", "file_IO", "grocery_folder");
//            Path groceryListFile = Paths.get("/Users", "chase", "Codeup", "codeup-java-exercises", "src", "file_IO", "grocery_folder", "GroceryList");
//            if (Files.exists(groceryFolder)) {
//                System.out.println("Already exists.");
//            } else {
//                Files.createDirectory(groceryFolder);
//            }
//            if (Files.exists(groceryListFile)) {
//                System.out.println("Already exists.");
//            } else {
//                Files.createFile(groceryListFile);
//            }
//            return groceryListFile;
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    public List<String> toStringList() {
        List<String> itemStrings = new ArrayList<>();
        for (GroceryItem item : groceryItems) {
            itemStrings.add(item.toString());
        }
        return itemStrings;
    }

    public GroceryItem getItemByName(String itemName) {
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            return groceryItems.get(index);
        }
        System.out.println("Could not find item: " + itemName);
        return null;
    }
}
