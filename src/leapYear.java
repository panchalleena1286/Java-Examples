import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year%4 == 0) {
            
            if (year%100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");  
                }
                else{
                    System.out.println("Non Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("not a Leap Year");
        }
    }
}
