import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Tester9 {

    public static void main(String args[]) {
        IntStream.range(1,4)
                .mapToObj(i -> "a"+i)
                .forEach(System.out::print);
        System.out.println("\n----------------------");

        Stream.of(1.0,2.0,3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a"+i)
                .forEach(System.out::print);

        System.out.println("\n----------------------");

        Stream.of("d2","a1","b1","b3","c")
                .filter(s-> {
                    System.out.println("filter:"+s);
                    return true;
                }).forEach(s-> {System.out.println("foreach:"+s);});

    }
}