import java.util.Arrays;
import java.util.Scanner;

public class CountPrimeUsingSieveofEranthosis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime[] = new boolean[n];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            if (isPrime[i] == true) count++;
            {
                System.out.print(count);
            }
        }
    }
    
}
