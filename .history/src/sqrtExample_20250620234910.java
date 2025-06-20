import java.util.Scanner;

public class sqrtExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sqrt(N));
    }

    public static int sqrt(int N) {
        int low = 0, high = N, ans = 0;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid; // long to avoid overflow

            if (square == N) {
                return mid; // perfect square
            } else if (square < N) {
                ans = mid;  // possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
