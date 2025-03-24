class OuterClass {
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;

    class InnerClass {
        void display() {
            System.out.println("outer_x = " + outer_x); // Can access static member of outer class
            System.out.println("outer_private = " + outer_private); // Can access private static member
            System.out.println("outer_y = " + outer_y); // Can access non-static member of outer class
        }
    }
}
public class nestedineerclass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); // Attach outer class object 
        inner.display();
    }
}
