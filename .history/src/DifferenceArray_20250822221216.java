import java.util.Scanner;
public class DifferenceArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the element of an array : ");

        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        

        // create difference array
        int diff[] = new int[n+1];

        System.out.println("Enter the query : ");
        int q = sc.nextInt();

    }
}
