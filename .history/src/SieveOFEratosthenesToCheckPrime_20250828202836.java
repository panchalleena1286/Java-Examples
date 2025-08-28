import java.util.Arrays;
import java.util.Scanner;

public class SieveOFEratosthenesToCheckPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sieve[] = new int[n+1];

        //fill all the value 1 in array
        Arrays.fill(sieve, 1);

        //Step 1 - 0 & 1 is not prime so we set it as not prime
        sieve[0] = 0;
        sieve[1] = 0;

        //step 2 = multiple of 2 , except of 2 we set all the 2's multiple as not prime
        for(int i=4; i<=n; i=i+2)
        {
            sieve[i] = 0;
        }

        //step 3 = (odd numbers)//i=3, j=(6,9,12,15,18,21..)//i=5, j=(10,15,20,25..)//i=7, j=(14,21,28...)
        for(int i=3; i<=n; i=i+2){

            if (sieve[i] == 1){

                for(int j =2*i; j<=n; j=j+i)
                {
                    sieve[j] = 0;
                }
            }

        }

        //step 4 = print all prime number
        
        
    }
    
}
