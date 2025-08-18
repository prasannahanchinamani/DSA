/*Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together
Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
  
Example 2:
Input: s = "aba"
Output: false;

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice. */

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concatstr=(s+s);
        String newstr=concatstr.substring(1,concatstr.length()-1);
        return newstr.contains(s);
    }
}

