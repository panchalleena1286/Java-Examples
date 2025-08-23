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

    }


    

    public static void main(String[] args) {
        
    }
}
