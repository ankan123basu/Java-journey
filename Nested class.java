class OuterClass {
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;

    // Static nested class
    static class NestedClass {
        void display() {
            System.out.println("outer_x = " + outer_x); // Can access static member of outer class
            System.out.println("outer_private = " + outer_private); // Can access private static member
            
            // Cannot access non-static member directly, so we need an instance
            OuterClass out = new OuterClass();
            System.out.println("outer_y = " + out.outer_y);
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedClass obj = new OuterClass.NestedClass();
        obj.display();
    }
}
