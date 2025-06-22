import java.util.Scanner;

public class PrefixArrayExample {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int diff[] = new int[n+1];

        int q = sc.nextInt();

        for (int i=0; i<q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int val = sc.nextInt();

            diff[l] += val;
            diff[r+1] -= val;

            int sum =0;

            for(int j=0; j<n; j++){

                sum = sum + diff[j];

                System.out.println(sum + arr[j]);
            }
        }

    }
    
}
