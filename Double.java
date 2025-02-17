interface shape{
    void area();        
}
class Color{
    void shapecolor(){
        System.out.println("Color of shape is red");
    }   
}
class Square extends Color implements shape{
    public void area(){
        int side = 5;
        System.out.println("Area of square is " + (side * side));
    }
}
class Double{
    public static void main(String[] args) {
        Square obj = new Square();
        obj.area();
        obj.shapecolor();
    }
}