public class Sstringgg {
    public static void main(String[] args) {
        String s1 = "Thursday!";
        System.out.println(s1.charAt(2));  // 'u'
        System.out.println(s1.length());   // 9
        System.out.println(s1.substring(3));  // "sday!"
        System.out.println(s1.substring(3,7));  // "sday"
        System.out.println(s1.contains("day"));  // true
        System.out.println(s1.toUpperCase());  // "THURSDAY!"
        System.out.println(s1.toLowerCase());  // "thursday!"

        String replaced = s1.replace("Thurs", "Fri");
        System.out.println(replaced);  // "Friday!"

        System.out.println(s1.isEmpty());  // false
        System.out.println(s1.indexOf('a'));  // 5
        System.out.println(s1.lastIndexOf('a'));  // 5
        System.out.println("bat".compareTo("cat"));  // negative (bat < cat)
        System.out.println("cat".compareTo("bat"));  // positive (cat > bat)
        System.out.println("cat".compareTo("cat"));  // 0 (equal)
        
        String s2 = "hello ";
        System.out.println(s2.concat("today"));  // "hello today"

        String str = "apple,ball,cat,dog";
        String[] arr = str.split(",");
        for(String i : arr) {
            System.out.println(i);  // prints each fruit/animal
        }

        String str2 = "apple : ball : cat : dog";
        String[] arr2 = str2.split(" : ");
        for(String i : arr2) {
            System.out.println(i.trim());  // trims spaces around the words
        }
    }
}
