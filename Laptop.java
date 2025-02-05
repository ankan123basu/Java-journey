import java.util.Scanner;

class Laptop {
     private String brand_name;
    private int memory;
    private int screen_size;
    private int price;

public void getdata() {              // if this was private then , call this func in display public func  
        Scanner sc = new Scanner(System.in);
          brand_name = sc.nextLine();
                memory = sc.nextInt();
              screen_size = sc.nextInt();
               price = sc.nextInt();
    }

 public void display() {
        System.out.println("Brand: " + brand_name);
        System.out.println("Memory: " + memory + "GB");
        System.out.println("Screen Size: " + screen_size + " inches");
        System.out.println("Price: $" + price);
    }
public static void main(String[] args) {
        Laptop myLaptop = new Laptop(); 
        myLaptop.getdata(); 
        myLaptop.display(); 
    }
}
