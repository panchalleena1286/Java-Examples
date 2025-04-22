import java.util.Scanner;

public class SumofRowsIn2DArray {
    
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of row: ");
    int n = sc.nextInt();
    System.out.print("Enter size of Column: ");
    int m = sc.nextInt();


    int arr[][] = new int[n][m];

    for(int i=0; i<n; i++)//row
    {
        for(int j=0; j<m; j++)//colum
        {
            arr[i][j] = sc.nextInt();
        }
    }


    //print subarray
    for(int i=0; i<n; i++)
    {
        int sum = 0;
        for(int j=0; j<m; j++)
        {
            sum += arr[i][j];
        }
        System.out.println(sum);
    }

    
  }
}
