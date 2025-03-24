import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(1, 20, 25);
        LocalTime time2 = LocalTime.of(3, 22, 27);

        Duration duration = Duration.between(time1, time2);

        System.out.println("Duration: " + duration);
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
        System.out.println("Seconds: " + duration.toSeconds());
    }
}
