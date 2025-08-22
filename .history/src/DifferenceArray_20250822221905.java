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

        for(int i=0; i<q; i++){

            System.out.println("Enter the querys first element : ");
            int l = sc.nextInt();
            System.out.println("Enter the querys last element : ");
            int r = sc.nextInt();
            System.out.println("Enter the value to make difference : ");
            float val = sc.nextInt();

            diff[l] += val;
            diff[r+1] -= val;
        }

        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum = sum + diff[i];

            System.out.println(sum + arr[i]);
        }

    }
}
