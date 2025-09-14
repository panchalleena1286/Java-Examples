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

        int[] arr2 = {-3, -1, -7, -2};
        System.out.println("Largest element in arr2: " + findLargestElement(arr2)); // Output: -1

        int[] arr3 = {7};
        System.out.println("Largest element in arr3: " + findLargestElement(arr3)); // Output: 7

        // Example of handling an empty array
        try {
            int[] arr4 = {};
            System.out.println("Largest element in arr4: " + findLargestElement(arr4));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Output: Error: Array cannot be null or empty.
        }
    }
}
