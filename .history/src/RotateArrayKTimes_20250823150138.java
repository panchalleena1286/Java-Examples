public class RotateArrayKTimes {
    
    //first we write function to reverse array using two pointers
    public void reverse(int[] nums, int start, int end){

        while(start < end){
             
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }    
        //we write logic to rotate array k times
    public void rotate(int nums[], int k){
           
        int n = nums.length;
        //if k>n we can write
        k = k % n;

        //reverse entire array
        reverse(nums, k, n);

        //reverse first k elements k=3 
        reverse(nums, 0, k-1);

        //reverse last k-n elements
        reverse(nums, k, n-1);

    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7};

        int k = 3;

        
        
    }
}
