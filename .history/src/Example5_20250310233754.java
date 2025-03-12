import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {

            count++;

            n = n/10;
            
        }
    }
}
