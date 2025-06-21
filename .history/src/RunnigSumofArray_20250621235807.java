public class RunnigSumofArray {
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5};

        int n = nums.length;

        int perfix[] = new int[n];

        int sum = 0;

        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            perfix[i] = sum;
        }

        for(int i=0; i<perfix.length; i++){

            System.out.print(perfix[i]);
        }
    }
}
