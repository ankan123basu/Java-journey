
import javax.print.attribute.Size2DSyntax;

public class Sstringgg {
    public static void main(String[] args) {
        String s1 = "Thursday!";
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,7));  
        System.out.println(s1.contains("day"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

       // String s1 = s1.replace("Thurs", "Fri");     error

        String replaced = s1.replace("Thurs", "Fri");
        System.out.println(replaced);

        System.out.println(s1.isEmpty());
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println("bat".compareTo("cat"));
        System.out.println("cat".compareTo("bat"));
        System.out.println("cat".compareTo("cat"));
        System.out.println(s2.concat("today"));

        String str = "apple,ball,cat,dog";
        String[] arr = str.split(",");
        for(String i : arr){
            System.out.println(i);
        }

        String str2 = "apple : ball : cat : dog";
        String[] arr2 = str2.split(" : ");
        for(String i : arr2){
            System.out.println(i.trim());
        }

        







    }
}
