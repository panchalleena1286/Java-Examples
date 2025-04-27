import java.util.Scanner;

public class PrintMatrixDigonally {

    public static void move(int R, int C, int arr[][], int col)
    {
        //row decrease
        //column increase

        
        while(R >= 0 && C < col)
        {

            System.out.print(arr[R][C] + " ");

            R--;
            C++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.println("Enter the size of Columns : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter Elements of matrix : ");
        //Insert elemnets into 2D array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //Step 1st - Rows Starting points
        System.out.println("Digonally Print Matrix is : ");

        for(int i=0; i<row; i++)
        {
            int R = i;
            int C = 0;

            move(R, C, arr, col);

        }

        //step 2nd - other starting points in columns
        for(int j=1; j<col; j++)
        {
            int R = row - 1;
            int C = j;

            move(R, C, arr, col);

        }

    }
    
}
