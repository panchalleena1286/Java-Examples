import java.util.Scanner;

public class SumOf2DDigonalElements {
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

    int SumL =0;
    int SumR = 0;
    for(int i=0; i<n; i++)
    {
        for (int j=0; j<n; j++)
        {
            if(i == j)
            {
                SumL += arr[i][j];
            }

            if((i+j == n-1)){
                SumR += arr[i][j];
            }
        }
    }

    System.out.println(SumL);
    System.out.println(SumR);
}
}
