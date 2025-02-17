
    import java.util.Scanner;

class Stringname2 {
    public static void main(String[] r) {
        Scanner s = new Scanner(System.in);
        String sb = s.nextLine(); 
        StringBuilder sbBuilder = new StringBuilder(sb);
        System.out.println("Original String: " + sbBuilder);  
        
        sbBuilder.insert(6," The Great");
        
        System.out.println("With inserted String: " + sbBuilder);  

  
        sbBuilder = new StringBuilder(sbBuilder.toString().toUpperCase());
        System.out.println("Uppercase String: " + sbBuilder); 


        String[] words = sbBuilder.toString().split(" ");
        
        System.out.println("Split Words: ");
        for (String word : words) {
            System.out.println(word);  
        }
    }
}

