import java.util.Scanner;

class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5; 
        float f = 5.0f; 
        float g = 10.45f; 
        double d = g;
        char c = (char) a;
        int j = (int) d; 

        System.out.println(a);  
        System.out.println(f);  
        System.out.println(g);  
        System.out.println(d);  
        System.out.println(c);  
        System.out.println(j);  
    }
}
