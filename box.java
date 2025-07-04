// Generic Box class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class box {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics!");
        System.out.println("String Box contains: " + stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Box contains: " + intBox.getItem());

         Box<Double> doubleBox = new Box<>();
         doubleBox.setItem(45.67);
    }

     
}
