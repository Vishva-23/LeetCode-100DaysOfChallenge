Maximum Water Container
Given an integer array height of length n, where each element represents the height of a vertical line drawn at position i, find two lines that, together with the x-axis, form a container. The goal is to find the container that can hold the maximum amount of water.
Example 1:
Input: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
Output: 49
Explanation: The above vertical lines are represented by the array [1, 8, 6, 2, 5, 4, 8, 3, 7]. In this case, the maximum area of water (blue section) the container can hold is 49.
Example 2:
Input: height = [1, 1]
Output: 1
Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104



Solution(PYTHON):
class Solution:
    def maxArea(self, A: List[int]) -> int:
        l = 0
        r = len(A) -1
        area = 0
        while l < r:
             area = max(area, min(A[l],A[r]) * (r - l))
             if A[l] < A[r]:
                 l += 1
             else:
                 r -= 1
        return area
