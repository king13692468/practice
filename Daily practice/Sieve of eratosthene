import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a number (upper limit to find primes)
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // This variable will store how many prime numbers we find
        int count = 0;

        // We’ll use an array where index = number and value = 1 (prime) or 0 (not prime)
        int[] prime = new int[num + 1];

        // Step 1: At the beginning, we assume ALL numbers are prime
        // Later, we’ll cancel out the ones which are not prime
        for (int i = 0; i <= num; i++) {
            prime[i] = 1; // mark everything as "prime for now"
        }

        // Step 2: But we already know 0 and 1 are not prime
        prime[0] = 0;
        prime[1] = 0;

        // Step 3: Start the sieve process
        // We only need to check numbers up to sqrt(num), because beyond that 
        // multiples are already marked.
        for (int i = 2; i * i <= num; i++) {
            // If the current number is still marked as prime...
            if (prime[i] == 1) {
                // ...then mark ALL of its multiples as not prime
                for (int j = i * 2; j <= num; j += i) {
                    prime[j] = 0;
                }
            }
        }

        // Step 4: Now we count how many numbers are still marked as prime
        for (int i = 2; i <= num; i++) {
            if (prime[i] == 1) {
                count++;
            }
        }

        // Final Output: Showing the number of primes we found
        System.out.println("Number of primes up to " + num + ": " + count);

        // Bonus: Let’s also print the prime numbers themselves for clarity
        System.out.print("Prime numbers are: ");
        for (int i = 2; i <= num; i++) {
            if (prime[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
Enter the number: 20
Number of primes up to 20: 8
Prime numbers are: 2 3 5 7 11 13 17 19 
*/
