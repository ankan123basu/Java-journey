
import java.time.LocalDate;
public class LOCALDATE {
    public static void main(String[] args) {
        //Current date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: "+today);

        //Speicific date
        LocalDate date = LocalDate.of(2025, 3, 10);
        System.out.println("Specific Date: "+date);


    }
}
