import java.util.Scanner;

public class ExampleOnString5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        String s = sc.next();

        String b = "World";

        System.out.println(s);

        System.out.println(s.concat(b));

        System.out.println(s + b);

        System.out.println(s.substring(1, 4));
    }
}
