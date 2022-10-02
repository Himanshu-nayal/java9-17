import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DropwhileDowhile {
    public static void main(String[] args) {
        System.out.println(IntStream.
                rangeClosed(1,20)
                .takeWhile(x->x<=10)
                .boxed()
                .collect(Collectors.toList())

        );
        System.out.println("____________________");
        System.out.println(IntStream
                .rangeClosed(1,20)
                .dropWhile(x->x<=10)
                .boxed()
                .collect(Collectors.toList())
        );
        System.out.println("--------using as list");
        System.out.println(Arrays.asList(1,2,4,5,6,7,8,9,10)
                .stream()
                .takeWhile(x->x<=5)
                .collect(Collectors.toList()));
        System.out.println("________________--");
        System.out.println(Arrays.asList(10,11,12,13,14,15,16,17,18,19,20).stream()
                .dropWhile(x->x<15).collect(Collectors.toList()));
    }

}
