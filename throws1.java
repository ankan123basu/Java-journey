
public class throws1 {
    static void divide(int a , int b) throws ArithmeticException {// throws keyword is used in method signature
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result: " + a/b);
    }
    public static void main(String[] args) {
        try {
            divide(10, 0); // This throw an exception
       
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println("Program continues");
    }
        
    } 
    

