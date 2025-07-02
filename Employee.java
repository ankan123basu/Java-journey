 public class Employee {                // Bean Class or JavaBean
   
    // Private data members
    private double salary;
    private String designation;

    // Getter for salary                      // Getter method to access the private data members by other
    public double getSalary() {
        return salary;
    }

    // Setter for salary                       // Setter method to modify/update the private data members by other
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for designation
    public String getDesignation() {
        return designation;
    }

    // Setter for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}


