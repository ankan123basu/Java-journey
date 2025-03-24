import java.util.Scanner;

public class StringA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Char at index " + i + ": " + ch);
        }

        sc.close();
    }
}
