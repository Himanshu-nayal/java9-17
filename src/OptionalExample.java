import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,12,13,14,15,17,19,29,30);
        System.out.println("______________________________________");
        list.stream().filter(e->e<15).
                findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("hello everyone"));
        System.out.println("---------else throw------------");
        list.stream().filter(e->e<15).findFirst().orElseThrow();

    }
}
