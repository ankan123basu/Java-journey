class Hello{
    static int c = 0;
    int display(){
        c++;
        return c;
    }
}
public class p3 {
    public static void main(String[] args) {
        
    
    Hello obj1 = new Hello();
    Hello obj2 = new Hello();
    Hello obj3 = new Hello();
    obj1.display();
    obj2.display();
    obj3.display();
    System.out.println(obj1.display());

}
}
