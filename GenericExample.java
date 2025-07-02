
// Generic method with bounds 
public class GenericExample{
    public static <T extends Number> void display(T value) { // Generic method with Number constraint
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        display(123); // Integer
        display(45.67); // Double
        display(789.0f); // Float
        display(100L); // Long
        // display("Hello"); // This will cause a compile-time error because String is not a Number
    }
}
