
 public class final1 {
     void show(){
         System.out.println("Final method");
     }
 }
 class final2 extends final1{
    void show(){
        System.out.println("Final method");
    }
    public static void main(String[] args) {
        final2 obj = new final2();
        obj.show();
    }
}

