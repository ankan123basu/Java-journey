import java.time.LocalDate;
import java.time.Period;    
public class PERIODDURATION {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2020, 12, 31);
        Period period = Period.between(date1, date2);
        System.out.println("Period: " + period);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
        
    }
}

