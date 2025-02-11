public class Iblock {
    static {                                     // independent of object creation , so called once 
        System.out.println("Static initializer block");
    }
    {
        System.out.println("Initializer block");
    }

    Iblock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Iblock obj1 = new Iblock();
        Iblock obj2 = new Iblock();
    }
}
