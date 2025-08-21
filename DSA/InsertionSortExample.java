public class InsertionSortExample {
    // Function to perform Insertion Sort
    static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        // because a single element (index 0) is already "sorted"
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // Take the current element (the one we want to place correctly)
            int j = i - 1;      // Start checking from the left side (previous elements)

            // Move elements one step ahead if they are bigger than 'key'
            // This creates space for inserting 'key' in the correct position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key into the correct position
            arr[j + 1] = key;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr); // Call the sorting function

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
Sorted array:
5 6 11 12 13
*/
