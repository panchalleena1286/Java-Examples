import java.util.Scanner;

public class ExampleOnString2 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        String str = new String("String");

        System.out.println(str);

        //to enter single character
        char s = sc.next().charAt(1);
        System.out.println(s);


    }
}
