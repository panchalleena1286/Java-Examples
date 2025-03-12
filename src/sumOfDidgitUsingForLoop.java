import java.util.Scanner;

public class sumOfDidgitUsingForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            int x =i;
            int sum = 0;

            while (x>0) {

                int lastDigit = x%10;
                sum = sum+lastDigit;
                x = x/10;
                
            }
            System.out.println(i + " --> " + sum);
        }
    }
}