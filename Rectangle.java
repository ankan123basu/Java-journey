import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(){  // non - parameterised
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l , int b){   // Parameterised
        length = l;
        breadth = b;
    }

    public void area(){
        System.out.println("Area is " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(x,y);
        r1.area();
        r2.area();
    }
}
