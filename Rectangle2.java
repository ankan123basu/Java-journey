import java.util.Scanner;

public class Rectangle2 {
    private int length;
    private int breadth;

    public Rectangle2(){  // non - parameterised
        this(1,1);
    }

    public Rectangle2(int length , int breadth){   // Parameterised
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area is " + (length * breadth));
        this.current();  // call a method by the current object in another method
    }

    public Rectangle2 current(){
        return this;  // return the current object
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Rectangle2 r1 = new Rectangle2();
        r1.current();
        Rectangle2 r2 = new Rectangle2(x,y);
        Rectangle r3 = new Rectangle(18,10);
        r1.area();
        r2.area();
        sc.close();
    }
}
    
