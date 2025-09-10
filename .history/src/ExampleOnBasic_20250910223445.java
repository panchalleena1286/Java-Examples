import java.util.Scanner;

public class ExampleOnBasic {

   static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) return false; // divisible → not prime
        }
        return true; // prime
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 35 are:");

        for (int i = 1; i <= 35; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
