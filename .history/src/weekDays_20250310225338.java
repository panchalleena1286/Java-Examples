import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        if (day == 1){
            System.out.println("Mon");
        }
        else if (day == 2) {
            System.out.println("Tues");
        }
    }
}
