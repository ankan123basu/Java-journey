import java.util.Scanner;

class Stringname {
    public static void main(String[] r) {
        
        String sb = " Rainy Day";
        StringBuilder sbBuilder = new StringBuilder(sb);
        System.out.println("Original String: " + sbBuilder);  
        
        sbBuilder.insert(6," Rainbow ");
        
        System.out.println("With inserted String: " + sbBuilder);  

  
        sbBuilder = new StringBuilder(sbBuilder.toString().repeat(5));
        System.out.println("Repeated: " + sbBuilder );
        System.out.println("Reversed: "+ sbBuilder.reverse());


        
        }
    }