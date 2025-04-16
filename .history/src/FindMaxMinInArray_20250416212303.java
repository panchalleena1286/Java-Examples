import java.util.Scanner;

public class FindMaxMinInArray {

    public static void FindMinAndMax(int arr[]){
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array :" );
        int n = sc.nextInt();

        int ar[] = new int[n];

        System.out.print("Enter the Elements in Array :" );
        for(int i=0; i<n; i++)
        {
            ar[i] = sc.nextInt();
        }
    }
    
}
