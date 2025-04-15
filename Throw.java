public class Throw {
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied: Not Eligible for voting");
        }
        else{
            System.out.println("Access granted: Eligible for voting");
        }
    }
    public static void main(String[] args) {
        checkAge(13);
        System.out.println("End of program");
    }
}
