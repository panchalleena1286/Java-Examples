import java.util.Scanner;

public class InputSubArray {

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
    for(int i=0; i<n; i++)//row
    {
        for(int j=0; j<m; j++)//colum
        {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
  }
}
