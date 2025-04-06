public class primeFactors {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to find and print prime factors
    public static void main(String[] args) {
        int n = 24;

        System.out.println("Prime factors of " + n + " are:");
        for (int i = 2; i <= n; i++) {
            // Check if i is a factor of n and is prime
            if (n % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
