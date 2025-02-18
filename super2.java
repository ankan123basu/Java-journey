class Parent {
    int num = 100;  
 Parent(){
    System.out.println("Parent constructor");
 }
    void display(){
        System.out.println("Parent display method");
    }
}


class Child extends Parent{
    int num = 110;  
    Child(){
        super();   //Calling the constructor of parent class
        System.out.println("Child constructor");
    }
    void show(){
        super.display();  //Calling the display method of parent class
        System.out.println("Number in child class " + num);
        System.out.println("Number in parent class " + super.num);
    }
}
public class super2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}