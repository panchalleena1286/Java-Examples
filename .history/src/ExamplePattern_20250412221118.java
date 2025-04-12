import java.util.Scanner;

public class ExamplePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int leftSpace = n-1;
        for(int i=1; i<=n; i++){
            //leftdspace
            for(int j=1; j<=leftSpace; j++){
                System.out.print(" ");
            }

            if (i == 1 || i == n) {

                //n star
                for(int j=1; j<=n; j++){
                    System.err.println("*");
                }
                
            }
            else
            {
                System.out.print("*");

                for(int j=1; j<=n-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            leftSpace = leftSpace - 1;
            System.out.println();
        }
    }

}
