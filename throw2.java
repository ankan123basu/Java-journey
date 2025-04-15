public class throw2 {
    public static void checkNum(int n) {
        if(n<0){
            throw new IllegalArgumentException("Number must be non-negative");
        } else {
            System.err.println("valid number");
        }
    }
    public static void main(String[] args) {
        try {
            checkNum(-5);                 // trycatch used in call
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } 
       
}
}
