import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

public class StreamExamp4 {
    public static void main(String[] args) {
        List<Emplist> name = Arrays.asList(
            new Emplist("John", 4000),
            new Emplist("Alie", 6000)
        );

        List<String> result = name.stream()
        
        .map(emp -> emp.name)
        .toList();

        System.out.println(result);
    }
}
