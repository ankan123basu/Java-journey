
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class ZONEDTIMEDATE {
    public static void main(String[] args) {
        //Current date and time
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println("Current Date and Time: "+currentDateTime);

        //Specific date and time
        ZonedDateTime specificDateTime = ZonedDateTime.of(2025, 3, 10, 14, 30, 0, 0, ZoneId.of("Asia/Kolkata"));
        System.out.println("Specific Date and Time: "+specificDateTime);
    }
}
