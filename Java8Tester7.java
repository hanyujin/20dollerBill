import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Tester7 {

    public static void main(String args[]) {
        List<String> myList = Arrays.asList("a1","a2","b3","b4","c5","c6");
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("a1" , "a2" ,"a3")
                .findFirst()
                .ifPresent(System.out::println);
    }
}