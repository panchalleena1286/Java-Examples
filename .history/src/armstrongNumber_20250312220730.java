import java.util.Scanner;

public class armstrongNumber {

    public static int powerFn(int a, int b){
        int answer = 1;
        for(int i=1; i<=b; i++){
            answer = answer*a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
    }
}