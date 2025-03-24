import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FORMATTINGPARSING {
    public static void main(String[] args) {
        //Formatting date and time
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Date and Time: "+dateTime.format(formatter));

        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE");
        System.out.println("Formatted Day: "+dateTime.format(day));

        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Formatted Date: "+dateTime.format(fd));

        
    }
}
