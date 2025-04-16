import java.util.Scanner;

public class CheckSortedArray {

    public static boolean iSArraySorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // fix here
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int ar[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        if (iSArraySorted(ar)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
