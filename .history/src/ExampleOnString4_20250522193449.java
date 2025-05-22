import java.util.Scanner;

public class ExampleOnString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(s);

        for(int i=0; i<s.length(); i++)
        {
            System.err.println(s.charAt(i));
        }
    }
    
}
