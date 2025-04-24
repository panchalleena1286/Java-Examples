import java.util.Scanner;

public class InterchangeDigonal2D {
     public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of row: ");
    int n = sc.nextInt();


    int arr[][] = new int[n][n];

    for(int i=0; i<n; i++)//row
    {
        for(int j=0; j<n; j++)//colum
        {
            arr[i][j] = sc.nextInt();
        }
    }

    int j = 0;
    for(int i=0; i<n; i++)
    {
        //swap (arr[i][j], arr[i][n-1-j])
        int temp = arr[i][j];
        arr[i][j] = arr[i][n-1-j];
        arr[i][n-1-j] = temp;

        j++;
    }

    for(int i=0; i<n; i++)//row
    {
        for(j=0; j<n; j++)//colum
        {
            System.out.print(arr[i][j] + " ");
        }
        System.err.println();
    }
}
}
