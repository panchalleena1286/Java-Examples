import java.util.Scanner;

public class AddValueInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int ar[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.print("Enter the Value that you want to add in the array: ");
        int value = sc.nextInt();

        System.out.print("Enter the Position that vlaue should be add in the array: ");
        int position = sc.nextInt();

        int answer[] = new int[n + 1];

        int i = 0;
        int j = 0;

        while(i < n+1){
            if(i == position-1)
            {
                answer[i] = value;
            }
            else
            {
                answer[i] = ar[j];
                j++;
            }

            i++;
        }

        i=0;
        while(i< n+1){
            System.out.print(answer[i] + " ");
            i++;
        }

    }
}
