import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Multiplication Table of :"+ num);
        for(int i=1; i<=10; i++){
            
            int result = num *i;

            System.out.println(result);
        }
        
    }
    
}
