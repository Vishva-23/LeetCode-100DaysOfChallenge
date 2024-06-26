class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        filter_=''
        for c in s:
            if c.isalnum():
                filter_ +=c.lower()
        return filter_ == filter_[::-1]
