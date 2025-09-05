public class OccurenceOfElementUsingRecursion {

    public static void occurEle(int index, int arr[], int target){

        if (index >= arr.length) {
            return;
        }

        if (arr[index] == target) {
            System.out.print(index);
        }

        occurEle(index + 1, arr, target);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,3,5,3,3};
        int target = 3;

        occurEle(0, arr, target);

    }
}
