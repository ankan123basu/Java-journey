public class Sstring {
    public static void main(String[] args) {
        String l1 = "Thursday!";
        String s1 = new String("Thursday!");

            String l2 = "Thursday!";
            String s2 = new String("Thursday!");

            System.out.println("Through literal 1" + l1);
            System.out.println("Through new keyword 1" + s1);
            System.out.println("Through literal 2" + l2);
            System.out.println("Through new keyword 2" + s2);



            System.out.println("Comparing string and string" + (s1 == s2));
            System.out.println("Comparing string and literal" + (s1 == l1));
            System.out.println("Comparing literal and literal" + (l1 == l2));
            System.out.println("Comparing literal and string" + (l2 == s1));

            System.out.println(s1.equals("Thursday!"));
            System.out.println("Comparing string and string" + (s1.equals(s2)));
            System.out.println("Comparing string and literal" + (s1.equals(l1)));
            System.out.println("Comparing literal and literal" + (l1.equals(l2)));  
            System.out.println("Comparing literal and string" + (l2.equals(s1)));
            System.out.println("Tim".equals("Jim"));


    }
}
