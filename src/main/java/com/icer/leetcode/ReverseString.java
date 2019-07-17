package com.icer.leetcode;

public class ReverseString {
    public static String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
//    private static void printReverse(char[] str) {
////        helper(0, str);
////    }
////
////    private static void helper(int index, char[] str) {
////        if (str == null || index >= str.length) {
////            return;
////        }
////        helper(index + 1, str);
////        System.out.print(str[index]);
////    }
}
