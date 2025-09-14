public class ArrayBasicsLargestNumber {
    public static int findLargestElement(int[] arr) {
        // Handle edge cases: empty or null array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        // Assume the first element is the largest initially
        int largest = arr[0];

        // Iterate through the rest of the array to find a larger element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 20, 8, 15};
        System.out.println("Largest element in arr1: " + findLargestElement(arr1)); // Output: 20
        
    }
}
