package leetcode;

public class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        String concatstr=(s+s);
        String newstr=concatstr.substring(1,concatstr.length()-1);
        return newstr.contains(s);
    }

    public static void main(String[] args) {
        String st="abcabcabcabc";
        System.out.println(repeatedSubstringPattern(st));
    }
}