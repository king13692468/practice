// Recursive program to reverse a string
public class ReverseStringRecursive {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        // Base case: if the string is empty or has only 1 character, return it directly
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case:
        // Take the last character + reverse of the remaining string
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String original = "github";  // Example input
        String reversed = reverse(original);  // Call the recursive function

        // Print results
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
/*
Original String: github
Reversed String: buhtig
*/
