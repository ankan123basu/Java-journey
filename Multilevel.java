public class Multilevel {
    void size(){
        System.out.println("Universe is infinite");
    }
}
class Star extends Multilevel{
    void twinkles(){
        System.out.println("Star is huge");
    }
}
class Planet extends Star{
    void shines(){
        System.out.println("Planet is small");
    }
}

class Main{
    public static void main(String[] args) {
        Multilevel obj = new Multilevel();
        obj.size();
        Star obj1 = new Star();
        obj1.twinkles();
        obj1.size();
        Planet obj2 = new Planet();
        obj2.shines();
        obj2.twinkles();
        obj2.size();
    }
}