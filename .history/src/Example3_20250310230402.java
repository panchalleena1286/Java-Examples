import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i=i+2){
            System.out.println(" Odd Numbers till "+ n);
        } 
    }
}
