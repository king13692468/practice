# 14. Longest Common Prefix

**Difficulty:** Easy
**Link:** [LeetCode Problem](https://leetcode.com/problems/longest-common-prefix/)

## Approach
I used a horizontal scanning approach. I start by assuming the first string in the array is the longest common prefix. Then, I loop through the remaining strings one by one. If the current string does not start with the current prefix, I chop off the last character of the prefix and check again. I repeat this until the prefix matches or becomes empty. If it becomes empty, there is no common prefix.

## Complexity
- **Time Complexity:** O(S) - Where S is the sum of all characters in all strings. In the worst case, we compare every character.
- **Space Complexity:** O(1) - We only use a few variables to keep track of the prefix. (Technically O(1) extra space, ignoring the space used by the substrings).
