import java.util.Scanner;

public class celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        String k = String.format("The temperature %.2f°C is equal to %.2f°F.", celsius, fahrenheit);
        System.out.println(k);

        sc.close();
}
}
