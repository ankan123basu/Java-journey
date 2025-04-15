import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        String data = "Hello, this is a test string to write to a file.";
        try (FileOutputStream fileOutputStream = new FileOutputStream("Output.txt")) {
            fileOutputStream.write(data.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
