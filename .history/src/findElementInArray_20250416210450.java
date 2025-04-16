import java.util.Scanner;

public class findElementInArray {

    public static boolean IsElementPresent(int arr[], int t){

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == t)
            {
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int ar[] = new int[n];
         int target = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            ar[i] = sc.nextInt();
        }

        
    }
}
