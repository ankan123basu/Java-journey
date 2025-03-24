import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Parsing {
    public static void main(String[] args) {
        //Parsing date and time
        String str = "17-03-2025 14:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime loc = LocalDateTime.parse(str, formatter);
        System.out.println("Parsed Date and Time: "+loc);
    }
}
