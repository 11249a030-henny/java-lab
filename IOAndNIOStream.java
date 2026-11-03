import java.io.*;
import java.nio.file.*;

public class IOAndNIOStream {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("input.txt");
        FileWriter writer = new FileWriter(inputFile);

        writer.write("Hello Java!\n");
        writer.write("This is File I/O and NIO Stream.");

        writer.close();

        System.out.println("I/O STREAM");
        System.out.println("----------");

        FileInputStream input = new FileInputStream("input.txt");
        FileOutputStream output = new FileOutputStream("io_output.txt");

        int data;

        while ((data = input.read()) != -1) {
            output.write(data);
        }

        input.close();
        output.close();

        System.out.println("File copied using I/O Stream.");
        System.out.println("Created: io_output.txt");

        System.out.println("\nNIO STREAM");
        System.out.println("----------");

        Path source = Paths.get("input.txt");
        Path destination = Paths.get("nio_output.txt");

        Files.copy(
            source,
            destination,
            StandardCopyOption.REPLACE_EXISTING
        );

        System.out.println("File copied using NIO.");
        System.out.println("Created: nio_output.txt");
    }
}
