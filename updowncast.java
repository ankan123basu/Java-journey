class Employee{
    void work(){
        System.out.println("Employee is working");
    }

}
class Manager extends Employee{
    void manage(){
        System.out.println("Manager is managing");
    }
}
 public class updowncast{                   
    public static void main(String[] args) {
        Employee emp = new Manager(); //upcasting
       if(emp instanceof Manager){ //check if emp is an instance of Manager
        Manager mgr = (Manager) emp; //downcasting
        mgr.manage(); // Safe call method
    }
}
}
    

