# 9. Palindrome Number

**Difficulty:** Easy
**Link:** [LeetCode Problem](https://leetcode.com/problems/palindrome-number/)

## Approach
To avoid integer overflow and extra memory usage, I reverted only the second half of the number. 
I first ruled out negative numbers and numbers ending in 0. Then, I built the reversed second half using a while loop. Finally, I compared the first half with the reversed second half. For numbers with an odd number of digits, the middle digit doesn't matter, so I divided the reversed number by 10 to remove it.

## Complexity
- **Time Complexity:** O(log10(n)) - We divide the input by 10 for every iteration.
- **Space Complexity:** O(1) - We only use a few integer variables.
