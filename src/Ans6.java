import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ans6 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,21,22,14,23,19,29,18,17);
        System.out.println(list.stream()
                .filter(e->e%2==0)
                .findFirst().stream()
                .collect(Collectors.toList()));
    }
}
