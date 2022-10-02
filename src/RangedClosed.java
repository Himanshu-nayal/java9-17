import java.util.stream.IntStream;

public class RangedClosed {
    public static void main(String[] args) {
        System.out.println("ranged closed example");
        IntStream.range(1,10).forEach(System.out::println);
        System.out.println("------------------------------");
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}
