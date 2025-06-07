public class MaximumSubArray {

    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i=1; i<nums.length; i++)
        {
            int option1 = nums[i];
            int option2 = nums[i] + currentSum;

            currentSum = Math.max(option1, option2);

            if(currentSum > maxSum)
            {
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);

    }
    
}
