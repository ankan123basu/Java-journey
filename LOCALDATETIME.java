
import java.time.LocalDateTime;
public class LOCALDATETIME {
    public static void main(String[] args) {
        //Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: "+currentDateTime);

        //Specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 3, 10, 14, 30);
        System.out.println("Specific Date and Time: "+specificDateTime);
    }
}
