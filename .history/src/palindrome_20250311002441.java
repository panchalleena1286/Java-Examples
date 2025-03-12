import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = n;
        int rev = 0;

        while (x>0) {
            int lastDigit = x%10;
            rev = rev * 10 + lastDigit;
            x =x/10;
        }

        if (n == rev) {
            System.out.println("n is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
