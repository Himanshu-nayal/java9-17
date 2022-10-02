import java.util.Iterator;
import java.util.stream.IntStream;

public class IterateExample {
    public static void main(String[] args) {
        IntStream.iterate(0,e->e<20,e->e+2).forEach(System.out::println);

    }
}
