class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Overiding equals methd of Object class
    public boolean equals(Object obj){
       if(this == obj){
           return true;
       }
         if(obj == null || getClass() != obj.getClass()){
              return false;
         }
            Person p = (Person) obj;
            return (age == p.age) && (name.equals(p.name));

}
}











public class EqualsExample {
    
}
