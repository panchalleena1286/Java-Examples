public class DivisorSieveExample {
    public static void main(String[] args) {
        
        int n =11;

        int countDivisor[] = new int[n];
        int sumDivisor[] = new int[n];

        for(int i=1; i<n; i++)
        {
            for(int j=i; j<n; j+=i)
            {
                countDivisor[j]++;
                sumDivisor[j] += i;
            }
        }

        for(int i=1; i<n; i++)
        {
            System.err.println(countDivisor[i]);
        }

        System.err.println();
        for(int i=1; i<n; i++)
        {
            System.err.println(sumDivisor[i]);
        }
    }
    
}
