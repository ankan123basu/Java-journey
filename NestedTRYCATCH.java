public class NestedTRYCATCH {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
               int num = 10/0; // Arithmetic Exception 
            }
             catch (ArithmeticException e) {
                System.out.println("Inner catch Cannot divide by zero");
            }
            System.out.println("Outer try block continues...");
        } 
        catch (Exception e) {
            System.out.println("Outer catch block");
        }
    }
}
