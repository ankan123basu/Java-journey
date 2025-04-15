public class TRYCATCH2 {
    public static void main(String[] args) {
        try {
           int arr[] = {1, 2, 3};
              System.out.println(arr[10]); // Throws exception and gets diverted to catch and subsequent statements will not get executed
              int num = 10/0; // THIS statement becomes out of reach as the above exception gets diverted to particular catch block so this line will not get executed
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
         catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        finally {
            System.out.println("Finally block is always executed"); // This block will always get executed irrespective of exception or not
        }
        System.out.println("Program continues...");
    }
}
