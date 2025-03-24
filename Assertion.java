public class Assertion {
    public static void main(String[] args) {
        int age = 20;
        assert age >= 18 : "Age must be 18 or above!";
        System.out.println("You are eligible to vote.");
    }
}