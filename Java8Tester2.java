import java.util.ArrayList;
import java.util.List;

/*

method references
using :: symbol

1. Static methods
2. Instance methods
3. Constructors using new operator (TreeSet::new)

* */
public class Java8Tester2 {
    final static String temp = "hello";


    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}