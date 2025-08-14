import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Ask the user for a number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Start with 1 because multiplying by 0 will ruin everything
        long factorial = 1;

        // Multiply numbers from 1 all the way up to num
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Same as factorial = factorial * i
        }

        // Show the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close(); // No more input needed
    }
}

/*
Example run:
Input: 5
Output: Factorial of 5 is: 120
*/
