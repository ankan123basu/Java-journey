
class Car{
    String brand;
    int year;
    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    //OVERRIDING THE TOSTRING METHOD OF OBJECT CLASS 
     @Override public String toString(){
        return "Car{Brand=" + brand + ", Year=" + year + "}";
    }

    //OVERRIDING THE HASHCODE METHOD OF OBJECT CLASS
    public int hashCode(){
        return year;
    }

    //OVERRIDING THE EQUALS METHOD OF OBJECT CLASS
    public boolean equals(Object obj){
        Car car = (Car) obj;
        if(this.brand == car.brand && this.year == car.year){
            return true;
        }
        return false;
    }
}

public class objclass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Ford", 2019);
        Car car3 = new Car("Chevrolet", 2018);  
        System.out.println(car1.toString());
        System.out.println(car1.hashCode());
        System.out.println(car1.getClass());
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
