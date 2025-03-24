import java.time.OffsetDateTime;
import java.time.ZoneOffset;
public class TIMEZONESOFFSETS {
    public static void main(String[] args) {
        OffsetDateTime offsetDT = OffsetDateTime.now(ZoneOffset.of("+05:30"));
        System.out.println("Zone Offset: " + offsetDT);
    }
} 
 