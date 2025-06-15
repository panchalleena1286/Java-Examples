public class MaxSumOfSubArrayOfSizeK {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        int k=3;
        int n = arr.length;
        int currentSum = 0;
        int i =0;

        //Sum of First K Element
        while (i<k) {
            currentSum += arr[i];
            i++;
        }

        //Sum of next Subaaray
        int maxSum = currentSum;
        while (i<n) {
            currentSum += arr[i];
            currentSum = currentSum - arr[i-k];

            if (currentSum > maxSum) {
                 maxSum = currentSum;
            }
            
            i++;
        }

        System.out.println(maxSum);
    }
}
