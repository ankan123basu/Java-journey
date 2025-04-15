import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputSream {
public static void main(String[] args) {
    String data = "Hello, this is a test string to write to a file using BufferedOutputStream.";
    try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("BufferedOutput.txt"))) {
        bufferedOutputStream.write(data.getBytes());
        System.out.println("Data written to file successfully using BufferedOutputStream.");
    } catch (IOException e) {
        e.printStackTrace();
}    
}
}
