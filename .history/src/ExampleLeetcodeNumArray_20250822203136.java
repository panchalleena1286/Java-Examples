public class ExampleLeetcodeNumArray {
    
    int prefix[];

    public NumArray(int[] nums) {
        
    }
    
    public int sumRange(int left, int right) {
        
    }

    public static void main(String[] args) {
        
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        System.out.println(numArray.sumRange(0, 2)); // 1
        System.out.println(numArray.sumRange(2, 5)); // -1
        System.out.println(numArray.sumRange(0, 5));
    }
}
