package Example1;

import java.util.Arrays;
import java.util.List;

public class MainClassOfEmployees {
    public static void main(String[] args) {

        List<Employees> employe = Arrays.asList(
            new Employees("Leena", 1, "IT"),
            new Employees("purva", 2, "HR"),
            new Employees("AAyu", 3, "Finance")
        );

    //    List<String> names =  employe.stream().map(Employees::getName).toList();

    //     System.out.println(names);
   

            long count = employe.stream()
                      .count();
            System.out.println(count);




    }
}
