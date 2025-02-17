public class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    void area() {
        int radius = 3;
        double result = Math.PI * radius * radius;
        System.out.println("Area of circle is " + result);
    }
}

class Square extends Shape {
    void area() {
        int side = 5;
        System.out.println("Area of square is " + (side * side));
    }
}

class Rectangle extends Shape {
    void area() {
        int length = 2;
        int breadth = 3;
        System.out.println("Area of rectangle is " + (length * breadth));
    }
}

 class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        circle.area();
        square.area(); 
        rectangle.area(); 
    }
}
