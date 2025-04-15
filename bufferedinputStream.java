import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bufferedinputStream {
public static void main(String[] args) {
    try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("Input.txt"))) {
        int data = bufferedInputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = bufferedInputStream.read();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }   


}

}
