import java.util.Scanner;

public class FindMaxMinInArray {

    public static void FindMinAndMax(int arr[], int min, int max){

        min = arr[0];
        max = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if( arr[i] < min ){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);

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

        FindMinAndMax(ar, n, n);
    }
    
}
