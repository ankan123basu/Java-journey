
import java.time.LocalTime;
public class LOCALTIME {
    public static void main(String[] args) {
        //Current time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: "+time);

        //Specific time
        LocalTime specificTime = LocalTime.of(14 ,30);
        System.out.println("Specific Time: "+specificTime);
    }
}
