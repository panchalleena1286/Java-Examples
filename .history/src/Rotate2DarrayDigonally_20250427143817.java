import java.util.Scanner;

public class Rotate2DarrayDigonally {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the size of columns: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        
        System.out.println("Enter the Elements in matrix: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
