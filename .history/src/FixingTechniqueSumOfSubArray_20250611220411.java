public class FixingTechniqueSumOfSubArray {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3};
        int n = arr.length;

        int sum = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)

            {
                sum = sum + arr[j];
                
                System.out.println("Subarray from " + i + " to " + j + " sum = " + sum);
            }
        }
    }
    
}
