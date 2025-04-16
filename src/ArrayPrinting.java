import java.util.Scanner;

public class ArrayPrinting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int ar[] = new int[n];

        //i = 0, ar[0] = 1
        //i=1, ar[1]= 3
        
        for(int i=0; i<n; i++){

            ar[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){

            System.out.println(ar[i] + " ");
        }
    }
    
}
