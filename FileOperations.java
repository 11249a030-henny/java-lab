import java.io.*;
import java.nio.file.*;

public class FileOperations {

    public static void main(String[] args) throws IOException {

        // 1. Create a file
        File file = new File("example.txt");

        if (file.createNewFile()) {
            System.out.println("File created.");
        } else {
            System.out.println("File already exists.");
        }

        // 2. Write to the file
        FileWriter writer = new FileWriter(file);
        writer.write("Hello, Java!\n");
        writer.write("This is file handling.");
        writer.close();

        // 3. Read the file
        BufferedReader reader =
            new BufferedReader(new FileReader(file));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

        // 4. Append to the file
        FileWriter appendWriter = new FileWriter(file, true);
        appendWriter.write("\nNew appended line.");
        appendWriter.close();

        // 5. Rename/Move the file
        Path oldPath = Paths.get("example.txt");
        Path newPath = Paths.get("newExample.txt");

        Files.move(oldPath, newPath,
                   StandardCopyOption.REPLACE_EXISTING);

        // 6. Delete the file
        Files.deleteIfExists(newPath);
    }
}
