import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unmodifiable {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,12,11,13,14,15,16,17,18,19);
        System.out.println("-----------------------------------------");
      // List.copyOf(list).add(4);
      list.stream().filter(e->e<11).collect(Collectors.toUnmodifiableList()).add(14);

    }




}
