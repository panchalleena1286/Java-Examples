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

        //To find maximum for create frequency array of that maximum size
        int maximum = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i] > maximum)
            {
                maximum = arr[i];
            }
        }

        int size = maximum + 1;

        //Create Frequency array
        int fre[] = new int[size];

        for(int i=0; i<n; i++)
        {
            fre[arr[i]]++;
        }

        //print frequency 

        for(int i=0; i<size; i++)
        {
            if (fre[i] > 0) {
                System.out.println(fre[i]);
            }
        }



    }

    
}
