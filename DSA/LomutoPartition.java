class QuickSortExample {

    // Function to place pivot in the correct position
    // and rearrange elements around it
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int j = low - 1;       // Pointer for the smaller element section

        // Traverse all elements except the pivot
        for (int i = low; i < high; i++) {
            // If current element is smaller than pivot
            if (arr[i] < pivot) {
                j++;  // Move boundary of smaller elements forward

                // Swap arr[i] with arr[j] so smaller elements
                // are collected on the left side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Finally, place the pivot right after the smaller elements
        int temp = arr[high];
        arr[high] = arr[j + 1];
        arr[j + 1] = temp;

        // Return pivot’s correct position
        return j + 1;
    }

    // QuickSort function: divide and conquer
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array → pivot is placed in correct spot
            int p = partition(arr, low, high);

            // Recursively sort the left side (before pivot)
            quickSort(arr, low, p - 1);

            // Recursively sort the right side (after pivot)
            quickSort(arr, p + 1, high);
        }
    }

    // Function to print array elements
    static void show(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5}; // Sample array
/*
  Sorted array:
1 5 7 8 9 10 
*/
