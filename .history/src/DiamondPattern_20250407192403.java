import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int space = n-1;
        int star = 1;

        //STEP 1 - print upper part
        for(int i=1; i<=n; i++)
        {
            //space
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=star; j++)
            {
                System.out.print("*");
            }

        }

        for(int i=1; i<=n-1; i++)
        {
            //space

            //star
        }
    }
}
