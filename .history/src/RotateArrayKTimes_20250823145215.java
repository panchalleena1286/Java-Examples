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

    public static void main(String[] args) {
        
    }
}
