import java.util.Scanner;

public class ontToNArmstrongNumber {
    public static int powerFn(int a, int b){
        int answer = 1;
        for(int i=1; i<=b; i++){
            answer = answer*a;
        }
        return answer;
    }

    public static boolean isArmstrongNum(int n){
        int copyOfN = n;
        int numberOfDigits = 0;

        //Number of digits
        while (n>0) {
            numberOfDigits++;
            n = n/10;
            
        }

        int sum = 0;
        n = copyOfN;

        while (n>0) {
            int lastDigit = n%10;//find the last digit

            sum = sum+ powerFn(lastDigit, numberOfDigits);
            n=n/10;
        }

        if (sum == copyOfN) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start; i<=end; i++){

            if(isArmstrongNum(i) == true){
                System.out.print(i + " ");
            }
        }
    }
        
}
