package file_IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileMain {
    public static void main(String[] args) throws IOException {
        Path demoFile = Paths.get("/Users", "chase", "Codeup", "codeup-java-exercises", "src", "file_IO", "demo.txt");
        System.out.println("Does the file exist? " + Files.exists(demoFile));

        if (Files.exists(demoFile)){
            System.out.println("Already exists.");
        } else {
            Files.createFile(demoFile);
        }

        List<String> fruits = Arrays.asList("Banana", "Apple", "Orange");
        Files.write(demoFile, fruits);
        // use StandardOpenOperation to APPEND to existing data. Default method is TRUNCATE_EXISTING
    }
}
