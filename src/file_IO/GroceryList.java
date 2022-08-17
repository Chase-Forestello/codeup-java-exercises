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
            System.out.println("\t" + item);
        }
    }

    public void removeGroceryItem(String itemName) {
        // find index of item with itemName
        int index = -1;
        for (int i = 0; i < groceryItems.size(); i++) {
            GroceryItem item = groceryItems.get(i);
            String itemNameInList = item.getName();
            if (itemNameInList.equalsIgnoreCase(itemName)) {
                // item is found so save its index
                index = i;
            }
        }

        // remove te item at that index
        if (index > -1) {
            groceryItems.remove(index);
        }
    }

    public void saveToFile() {
        // Make path object
        Path file = makeFileAndDirectory();
        List<String> tempItems = new ArrayList<>();
        for (GroceryItem item : groceryItems) {
            tempItems.add(item.toString());
        }
        try {
            assert file != null;
            Files.write(file, tempItems);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Path makeFileAndDirectory() {
        try {

            Path groceryFolder = Paths.get("grocery_folder");
            Path groceryFile = Paths.get("grocery_folder", "groceryList.txt");
            if (Files.exists(groceryFolder)) {
                System.out.println("Already exists.");
            } else {
                Files.createDirectory(groceryFolder);
            }
            if (Files.exists(groceryFile)) {
                System.out.println("Already exists.");
            } else {
                Files.createFile(groceryFile);
            }
            return groceryFile;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
