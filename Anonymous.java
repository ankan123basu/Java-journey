// Abstract class
abstract class ABC {
    abstract void show();
}

// Anonymous inner class implementation
public class Anonymous {
    public static void main(String[] args) {
        ABC obj = new ABC() {  // Creating an anonymous inner class
            void show() {
                System.out.println("Anonymous Inner Class Implementation");
            }
        };

        obj.show();
    }
}
