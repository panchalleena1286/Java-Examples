import java.util.Scanner;

public class RotateArrayNTimes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int n = sc.nextInt();
        System.out.println("Enter value for how many times to rotate an Array : ");
        int k = sc.nextInt();//k times to rotate an array

        int arr[] = new int[n];
        System.out.println("Enter values of an Array : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int reversed[] = new int[n];

        k = k%n;

        for(int i=0; i<n; i++)
        {
            int newIndex = (i-k);
            if(newIndex < 0)
            {
                newIndex += n;
            }
            reversed[newIndex] = arr[i];
        }

        for(int i=0; i<n; i++)
        {
            System.out.println(reversed[i] + " ");
        }

    }
    
}
