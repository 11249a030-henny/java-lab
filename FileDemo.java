import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("test.txt");

        try {
            if (f.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
