import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputExample{
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("Input.txt");
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



