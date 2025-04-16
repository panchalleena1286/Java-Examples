public class ArrayPassByValue {

    public static void printArr(int arr[], int a){

        System.err.println(arr.length);
        arr[1] = 1000;

        a = 500;
    }
    public static void main(String[] args) {
        
        int arr[] = new int[3];
        int a = 50;
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 100;

        printArr(arr, a);
        System.err.println(arr[1]);

        System.out.print(a);


    }
}
