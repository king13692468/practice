class QuickSortHoare {
    // Function to perform Hoare Partition
    static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the first element as pivot
        int i = low - 1;      // Start pointer before the array
        int j = high + 1;     // Start pointer after the array

        while (true) {
            // Move 'i' to the right until finding an element >= pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Move 'j' to the left until finding an element <= pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If pointers cross, return the partition index
            if (i >= j) {
                return j;
            }

            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // QuickSort using Hoare partition
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = hoarePartition(arr, low, high);

            // Sort the left part
            quickSort(arr, low, p);

            // Sort the right part
            quickSort(arr, p + 1, high);
        }
    }

    // Driver code
    public static void main(String[] args) {
        // Predefined array (no input needed)
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call QuickSort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
Original array:
10 7 8 9 1 5 

Sorted array:
1 5 7 8 9 10
*/
