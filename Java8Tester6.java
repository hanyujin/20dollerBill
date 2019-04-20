import java.util.Arrays;
import java.util.List;

public class Java8Tester6 {

    public static void main(String args[]) {
        List<String> myList = Arrays.asList("a1","a2","b3","b4","c5","c6");
        myList.stream()
                .filter(s->s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}