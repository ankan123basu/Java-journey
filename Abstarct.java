abstract class Subject {
 void marks(){
        System.out.println("marks");
 }
    abstract void result();
    abstract void display();
}
class Student extends Subject{
    void result(){
        System.out.println("result");
    }
    void display(){
        System.out.println("display");
    }
}
public class Abstarct {
    public static void main(String[] args) {
        Student s = new Student();
        s.result();
        s.display();
        s.marks();
    }
}
