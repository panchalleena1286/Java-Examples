import java.util.Scanner;
import java.util.scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    
}
