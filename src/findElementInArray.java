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

        System.out.print("Enter the size of an array : ");
         int n = sc.nextInt();
         
         int ar[] = new int[n];

         System.out.println("Enter the target element: ");
         int target = sc.nextInt();
         
         System.out.print("Enter the Elements of an array : ");
        for(int i=0; i<n; i++)
        {
            ar[i] = sc.nextInt();
        }


        if(IsElementPresent(ar, target) == true){
            System.out.print("Element is present");
        }
        else {
            System.out.print("Element is Not present"); 
        }
        
    }
}
