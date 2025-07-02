class GenericExample{                               //  Generic method
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        display("Hello, World!"); // String
        display(123); // Integer
        display(45.67); // Double
        display(true); // Boolean
    }
}
