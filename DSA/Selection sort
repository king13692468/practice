public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Selection Sort starts here
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the first element of the unsorted part is the smallest
            int minIndex = i;

            // Look through the rest of the array to find if there's anything smaller
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Found a smaller element, update minIndex
                }
            }

            // If the assumed "smallest" was not actually the smallest, swap them
    
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            // At this point, one more element is in its correct position
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
Enter number of elements: 5
Enter 5 elements:
64 25 12 22 11
Sorted array:
11 12 22 25 64
*/
