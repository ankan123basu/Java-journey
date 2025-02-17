interface Animal{
    void sound();
    void eat(String type);
}
interface  Pet{
    void freindly();
    double milkyield(int amount, double price);
    
}

class Cow implements Animal,Pet{
    public void sound(){
        System.out.println("Cow says moo");
    }
    public void eat(String etype){
        System.out.println(etype + " Cow eats grass");
    }
    public void freindly(){
        System.out.println("Cow is friendly");
    }
    public double milkyield(int amount, double price){
        return amount * price;
    }

}

public class Interface{
    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.sound();
        obj.eat("Herbivorous");
        obj.freindly();
        System.out.println("Milk yield is " + obj.milkyield(10, 20.5));
    }
}