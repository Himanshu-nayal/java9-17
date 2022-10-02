import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseOfMethod {
    public static void main(String[] args) {
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,11));
        System.out.println(Set.of(2,3,4,5,6,8,9,10,11,21));
        System.out.println(Map.of(1,"one",2,"two",3,"three",4,"four"));
    }
}
