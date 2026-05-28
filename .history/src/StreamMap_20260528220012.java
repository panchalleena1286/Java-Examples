import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

List<Integer> result = words.stream()
        .map(String::length)
        .toList();

System.out.println(result);
    }
}
