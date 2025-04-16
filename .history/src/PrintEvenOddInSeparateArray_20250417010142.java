import java.util.Scanner;

public class PrintEvenOddInSeparateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]/2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }

    }
}