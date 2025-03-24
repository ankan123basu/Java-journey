import java.time.LocalDate;
public class Adjustingdatestimes {
    public static void main(String[] args) {
        //Current date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: "+today);

        //Speicific date
        LocalDate date = LocalDate.of(2025, 3, 10);
        System.out.println("Specific Date: "+date);

        //Add 1 day to the current date
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: "+tomorrow);

        //Subtract 1 month from the current date
        LocalDate previousMonth = today.minusMonths(1);
        System.out.println("Previous Month: "+previousMonth);

        //Add 1 year to the specific date
        LocalDate nextYear = date.plusYears(1);
        System.out.println("Next Year: "+nextYear);

        //Subtract 1 week from the specific date
        LocalDate previousWeek = date.minusWeeks(1);
        System.out.println("Previous Week: "+previousWeek);

        LocalDate adjustedDate = today.withYear(2030);
        System.out.println("Adjusted Date: "+adjustedDate);
    }
}
