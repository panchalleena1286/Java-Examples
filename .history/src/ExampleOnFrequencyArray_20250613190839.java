import java.util.Scanner;

public class ExampleOnFrequencyArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elemnets in an array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }


    }

    
}
