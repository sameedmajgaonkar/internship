import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("notes.txt");

        try{
            Files.createFile(filePath);
            System.out.println("File created");
        }
        catch (FileAlreadyExistsException e) {
            System.err.println("File already exists!");
        }
        catch (IOException e) {
            System.err.println("An error occurred while trying to create the file!");
        }

        try{
            Files.writeString(filePath, "Optimus Prime UEAEUEUAAUOOOAEU", StandardOpenOption.APPEND);
            System.out.println("Content written successfully");
        }
        catch (IOException e) {
            System.err.println("An error occurred while trying to write the file!");
        }

        try {
        List<String> lines = Files.readAllLines(filePath);
        lines.forEach(System.out::println);
        }
        catch (IOException e) {
            System.err.println("An error occurred while trying to read the file!");
        }
    }
}
