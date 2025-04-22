import java.util.Scanner;

public class SumOfColumsIn2DArray {

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


    //print sum of each Column
    for(int j=0; j<m; j++)//Column
    {
        int sum = 0;
        for(int i=0; i<n; i++)//row
        {
           sum += arr[i][j];
        }
        System.out.println(sum);
    }
  }
    
}
