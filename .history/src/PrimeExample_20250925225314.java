public class PrimeExample {

    public static boolean isPrime(int n){

        if (n<=1) {
            return false;
        }

        for(int i=2; i<n; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int n = 28;

        if (isPrime(n)) {
            System.out.println(n + "Prime");
        }else {
            System.out.println(n + " not prime");
        }
        
    }
}
