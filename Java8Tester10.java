import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Tester10 {

    public static void main(String args[]) {
        System.out.println("\n----------------------");

        Stream.of("d2","a2","b1","b3","c")
                .map(s-> {
                    System.out.println("map "+s);
                    return s.toUpperCase();
                })
                .anyMatch(s->{
                    System.out.println("anyMATCH "+s);
                    return s.startsWith("A");
                });
    }
}

/*
*
----------------------
map d2
anyMATCH D2
map a2
anyMATCH A2

* anyMatch 주어진 입력에 대해 Predicate가 만족되면 true를 반환한다.
* */