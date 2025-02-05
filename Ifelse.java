import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's score : ");
        int score = sc.nextInt();

             if (score > 90) {
            System.out.println("Grade: A");
        } else if (score >= 70 && score <= 90) {
            System.out.println("Grade: B");
        } else if (score >= 50 && score < 70) {
            System.out.println("Eligible for internship only");
        } else  {
            System.out.println("Not eligible");
        } 
        sc.close();
    }
}
