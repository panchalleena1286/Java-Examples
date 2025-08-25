public class CheckPrime {

    boolean isPrime(int n){

        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if (n % i == 0) {

                return false;
                
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CheckPrime c = new CheckPrime();
        c.isPrime(5);

        
    }
}
