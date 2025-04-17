import java.util.Scanner;

public class smallestAndSecondSmallestElemnetInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println(" Enter Elements of an array : ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int minE = (int)(1e9);
        int secondMinE = (int)(1e9);

        for(int i=0; i<n; i++)
        {
            if(arr[i] < minE)
            {
                secondMinE = minE;
                minE = arr[i];
            }
            else
            {
                if(arr[i] > minE && arr[i] < secondMinE)
                {
                    secondMinE = arr[i];
                }
            }
        }
    }
}
