public class ExampleOnPrime {

    public boolean isPrime(int n){
        if (n <= 1) return false;  // 0 and 1 are not prime

        // check all numbers from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;  // divisible → not prime
            }
        }
        return true; 
    }
    
    public static void main(String[] args) {
        

    }
}
