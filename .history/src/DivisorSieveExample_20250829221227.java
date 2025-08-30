public class DivisorSieveExample {
    public static void main(String[] args) {
        
        int n =11;

        int countDivisor[] = new int[n];
        int sunDivisor[] = new int[n];

        for(int i=1; i<n; i++)
        {
            for(int j=i; j<n; j+=i)
            {
                countDivisor[j]++;
                sunDivisor[j] += i;
            }
        }
    }
    
}
