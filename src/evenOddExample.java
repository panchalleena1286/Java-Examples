import java.util.Scanner;

public class evenOddExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        if (n%2 == 0) 
       {
        System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
