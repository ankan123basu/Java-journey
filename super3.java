class Parent{
 int age;
    Parent(int age){
        this.age = age; //this keyword is used to refer to the current object
    }   
}

class Child extends Parent{
   String name;
    Child(String name, int age){
        super(age); 			//super keyword is used to call the constructor of the parent class
        this.name = name;
    }
}

     class super3{
    public static void main(String[] args) {
        Child obj = new Child("John", 25);
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}