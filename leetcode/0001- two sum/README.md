# 1. Two Sum

**Difficulty:** Easy
**Link:** [LeetCode Problem](https://leetcode.com/problems/two-sum/)

## Approach
To solve this in a single pass, I used a Hash Map to store the numbers I've seen so far and their indices. For each number, I calculate its `partner` (target - current number). If the partner is already in the map, we found our solution. Otherwise, we add the current number to the map and move on.

## Complexity
- **Time Complexity:** O(n) - We traverse the array only once.
- **Space Complexity:** O(n) - The Hash Map can store up to `n` elements.
