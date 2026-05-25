import java.util.Arrays;
import java.util.List;

public class StreamExmp3 {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "John");

        List<String> result = names.stream()
        .filter(name -> name.startsWith("A"))
        .toList();

System.out.println(result);
    }
}
