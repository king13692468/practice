import java.util.Scanner;

public class FibonacciRecursion {
    
    // This method will return the nth Fibonacci number
    static int fibonacci(int n) {
        // Base case: if it's the first or second term, just return n
        if (n <= 1) {
            return n;
        }
        // Otherwise, add the two previous terms
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Ask the user how many terms they want
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();

        // Show the Fibonacci series
        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close(); // Done taking input
    }
}

/*
Example run:
Input: 7
Output: Fibonacci series up to 7 terms:
0 1 1 2 3 5 8
*/
