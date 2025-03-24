class DEF {
    private int data = 30; // INSTANCE VAR
    void display() {
        int value= 50; // LOCAL VAR
        class Local {
            void msg() {
                System.out.println(data);
                System.out.println(value);
            }}
                Local n = new Local();
                n.msg();
                  }
        }
    


public class localclass {
    public static void main(String[] args) {
        DEF obj = new DEF();
        obj.display();
    }
    
}
