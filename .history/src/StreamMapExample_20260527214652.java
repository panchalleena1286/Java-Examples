import java.util.Arrays;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);

    List<Integer> result = numbers.stream()
        .map(n -> n * n)
        .toList();

System.out.println(result);
    }
}
