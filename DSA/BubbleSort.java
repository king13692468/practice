import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Take array input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort starts here
        // The idea is: keep comparing neighbors and swap if out of order
        for (int i = 0; i < n - 1; i++) {
            // After every full pass, the largest element moves to the end
            // So we reduce the range each time
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap because left one is bigger than right one
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // One pass completed, largest element is placed at its right position
        }

        // Step 3: Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
Enter the number of elements: 5
Enter 5 elements:
64 25 12 22 11
Sorted array:
11 12 22 25 64
*/
