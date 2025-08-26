public class ExampleonTwoSum {

    public static int[] main(String[] args) {
        
        int[] nums = {2, 7, 11, 19};
        int n = nums.length;
        int target = 9;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
        
    }
    
}
