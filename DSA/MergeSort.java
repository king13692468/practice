class MergeSortExample {

    // This function merges two sorted halves into one sorted section
    static void merge(int[] arr, int low, int mid, int high) {
        // Find sizes of the two subarrays
        int n1 = mid + 1 - low;
        int n2 = high - mid;

        // Create temporary arrays to hold left and right halves
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the two halves back into the main array
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            // Pick the smaller element from left or right
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements of left[] (if any)
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements of right[] (if any)
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    // This function splits the array into halves and sorts each half
    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = low + (high - low) / 2;

            // Sort first half
            mergeSort(arr, low, mid);

            // Sort second half
            mergeSort(arr, mid + 1, high);

            // Merge the two sorted halves
            merge(arr, low, mid, high);
        }
    }

    // Driver function to test the algorithm
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5}; // Example array
        int n = arr.length;

        // Call merge sort on the entire array
        mergeSort(arr, 0, n - 1);

        // Print the sorted result
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
Sorted array:
1 5 7 8 9 10
*/
