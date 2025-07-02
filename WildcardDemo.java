import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World");
        printList(stringList);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        printList(intList);
    }
}
