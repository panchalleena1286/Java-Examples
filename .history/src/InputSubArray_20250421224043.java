import java.util.Scanner;

public class InputSubArray {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
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
    for(int i=0; i<n; i++)//row
    {
        for(int j=0; j<m; j++)//colum
        {
            System.err.print(arr[i][j]);
        }
        System.err.println();
    }
  }
}
