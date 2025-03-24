class School{
    private String name, address;
    School(String name, String address){
        this.name = name;
        this.address = address;
    }
     void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}

public class p2 {
    public static void main(String[] args) {
    School obj = new School("DPS", "Delhi");
    obj.getDetails();
}
}
