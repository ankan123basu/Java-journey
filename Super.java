class Animal{
    Animal(String type){
        System.out.println("Animal type is " + type);   
    }
}

//Subclass
class Dog extends Animal{
    Dog(String breed){
        super("Mammal");  //Calling the constructor of parent class
        System.out.println("Dog breed is " + breed);
    }
}

public class Super {
    public static void main(String[] args) {
        Dog obj = new Dog("Bulldog");
    }
}