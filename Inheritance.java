public class Inheritance {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Inheritance{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends   Inheritance{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Main{
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.sound();
        Inheritance obj1 = new Dog();
        obj1.sound();
        Inheritance obj2 = new Cat();
        obj2.sound();
    }
}
