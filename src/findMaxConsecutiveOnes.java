import java.util.Scanner;

public class findMaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] nums = new int[n];

        System.out.println("Enter value in array: ");
        for(int i=0; i<n; i++){

            nums[i] = sc.nextInt();
        }

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
