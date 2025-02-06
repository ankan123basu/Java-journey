import java.util.Scanner;

public class Rectangle2 {
    private int length;
    private int breadth;

    public Rectangle2(){  // non - parameterised
        length = 1;
        breadth = 1;
    }

    public Rectangle2(int length , int breadth){   // Parameterised
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area is " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Rectangle2 r1 = new Rectangle2();
        Rectangle2 r2 = new Rectangle2(x,y);
        r1.area();
        r2.area();
    }
}
