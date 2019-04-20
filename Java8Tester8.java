import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Tester8 {

    public static void main(String args[]) {
        Arrays.stream(new int[]{1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
        System.out.println("----------------------");

        Stream.of("a1","a2","a3")
                .map(s -> s.substring(1))
                .forEach(System.out::print);

        System.out.println("\n----------------------");

        Stream.of("a1","a2","a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::print);
    }
}