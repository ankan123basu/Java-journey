import java.io.*;
class Student implements Serializable {
    private static final long serialVersionUID = 12345678L; // Unique ID for serialization
    String name;
    int age;
    transient String password; // This field will not be serialized

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Password: " + password); // This will be null after deserialization
    }

}
public class objectSerialisation {
  public static void main(String[] args) {

    Student student = new Student("John Doe", 20, "securePassword123");

    // Serialize the object
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
        out.writeObject(student);
        System.out.println("Student object serialized successfully.");
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Deserialize the object
    student = null;
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
        Student ds = (Student) in.readObject();
        System.out.println("Student object deserialized successfully.");
        ds.display();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
      

  }  
}
