package com.icer.leetcode;

public class PalindromeNumber {
    /**
     * 9. Palindrome Number  回文数
     */
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int j = x;
        int result = 0;
        while (j != 0) {
            result = result * 10 + j % 10;
            j = j / 10;
        }
        return x == result;
    }
}
