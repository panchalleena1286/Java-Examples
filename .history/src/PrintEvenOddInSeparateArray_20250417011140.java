import java.util.Scanner;

public class PrintEvenOddInSeparateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]%2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }


        if(countEven > 0)
        {
            int indexEven = 0;
            int evenArr[] = new int[countEven];

            for(int i=0; i<n; i++)
            {
                if(arr[i]%2 == 0)
                {
                    evenArr[indexEven] = arr[i];
                    indexEven++;
                    System.out.print(evenArr);
                }
            }
        }

        if(countOdd > 0)
        {
            int indexOdd = 0;
            int oddArr[] = new int[countOdd];

            for(int i=0; i<n; i++)
            {
                if(arr[i]%2 != 0)
                {
                    oddArr[indexOdd] = arr[i];
                    indexOdd++;
                    System.out.print(oddArr);
                }
            }
        }
    }
}