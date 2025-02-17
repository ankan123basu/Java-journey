interface Animal{
    void sound();
    void eat();
}
interface  Pet{
    void freindly();
}

class Cow implements Animal,Pet{
    public void sound(){
        System.out.println("Cow says moo");
    }
    public void eat(){
        System.out.println("Cow eats grass");
    }
    public void freindly(){
        System.out.println("Cow is friendly");
    }
}

class Main{
    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.sound();
        obj.eat();
        obj.freindly();
    }
}