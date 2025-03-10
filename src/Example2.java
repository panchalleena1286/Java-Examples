import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int value = ch;

        if ((value >= 65 && value <= 90)|| (value >= 97 && value <= 122)) {
            System.out.println("It is a Alphabet");
        }
        else{
            System.out.println("It is a digit");
        }



    }
}
