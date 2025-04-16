import java.util.Scanner;

public class PrintSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements in the array : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)// i ----> Starting Point
        {
            for(int j=i; j<n; j++)//j ---> Ending Point
            {
                //subarray i to j

                for(int k=i; k<=j; k++)
                {
                    System.out.print("Subarray of an Array : " + arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}
