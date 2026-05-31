import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamExamp5 {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
        Arrays.asList("A", "B"),
        Arrays.asList("C", "D")
);

List<String> result = list.stream()
        .flatMap(Collection::stream)
        .toList();

System.out.println(result);
    }
}
