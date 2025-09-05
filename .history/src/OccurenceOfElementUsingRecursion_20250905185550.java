public class OccurenceOfElementUsingRecursion {

    public static void occurEle(int index, int arr[], int target){


        if (arr[index] == target) {
            occurEle(index + 1, arr, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,3,5,3,3};
        int target = 3;

    }
}
