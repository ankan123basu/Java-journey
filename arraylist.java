import java.util.ArrayList;

class Laptop {
    private String brandName;
    private double price;
    private int memory;

    public Laptop(String brandName, double price, int memory) {
        this.brandName = brandName;
        this.price = price;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + ", Price: " + price + ", Memory: " + memory + "GB";
    }
}

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Laptop> l = new ArrayList<>();
        l.add(new Laptop("Lemono", 50000.0, 8));
        l.add(new Laptop("Dell", 65000.0, 16));

        System.out.println("--- Laptop Details ---");
        for (Laptop laptop : l) {
            System.out.println(laptop);
        }
    }
}
