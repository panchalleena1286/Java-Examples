import java.util.Scanner;

public class findMaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] nums = new int[n];

        int count = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                count++;
                if (count > maxCount) {
                maxCount = count;
}
            }
            else
            {
                count = 0;
            }
        }

        System.out.println(maxCount);

    }
    
}
