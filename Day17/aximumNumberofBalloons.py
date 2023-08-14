Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:
Input: text = "nlaebolko"
Output: 1

Example 2:
Input: text = "loonbalxballpoon"
Output: 2

Example 3:
Input: text = "leetcode"
Output: 0


Solution:
class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        return min(text.count('b'),text.count('a'),text.count('l')//2,text.count('o')//2,text.count('n'))
