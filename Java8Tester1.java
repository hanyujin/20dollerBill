import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*scope
*
* using lambda expression,
* */
public class Java8Tester1 {
    final static String temp = "hello";

    public static void main(String args[]) {
        GreetingService service1 = message->System.out.println(temp+message);
        service1.sayMessage("yujin");
    }

    interface GreetingService{
        void sayMessage(String message);
    }
}