public class ExampleLeetcodeNumArray {
    
    int prefix[];

    public ExampleLeetcodeNumArray(int[] nums) {
        int sum =0;

        int n = nums.length;

        prefix = new int[n];

        for(int i=0; i<n; i++)
        {
            sum = sum + nums[i];
            prefix[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        
        if (left == 0) {
            return prefix[right];
        }
        else{
            return prefix[right] - prefix[left-1];
        }
    }

    public static void main(String[] args) {
        
        int[] nums = {-2, 0, 3, -5, 2, -1};

        ExampleLeetcodeNumArray numArray = new ExampleLeetcodeNumArray(nums);

        System.out.println(numArray.sumRange(0, 2)); // 1
        System.out.println(numArray.sumRange(2, 5)); // -1
        System.out.println(numArray.sumRange(0, 5));
    }
}
