# 13. Roman to Integer

**Difficulty:** Easy
**Link:** [LeetCode Problem](https://leetcode.com/problems/roman-to-integer/)

## Approach
Instead of writing a huge set of rules for every possible combination, I just read the string from left to right. 
Usually, Roman numerals are just added together. But if a smaller value appears before a larger value (like `I` before `V`), it means we should subtract it. So, I check the current character against the next one. If the current is smaller, I subtract it from the total; otherwise, I add it.

## Complexity
- **Time Complexity:** O(1) - The string has a maximum length of 15 characters.
- **Space Complexity:** O(1) - The `switch` statement takes up constant space, no extra memory used.
