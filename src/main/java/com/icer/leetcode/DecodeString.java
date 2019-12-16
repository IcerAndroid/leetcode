package com.icer.leetcode;

import java.util.Stack;

/**
 * 394. Decode String
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */
public class DecodeString {

    public static void main(String[] args) {
        DecodeString obj = new DecodeString();
        String result = obj.decodeString("3[a2[v]]2[bc]");
        System.out.println(result);
    }

    public String decodeString(String s) {
        String res = "";
        int multils = 0;
        Stack<String> resStack = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                resStack.push(res);
                counts.push(multils);
                multils = 0;
                res = "";
            } else if (c == ']') {
                int count = counts.pop();
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    temp.append(res);
                }
                res = resStack.pop() + temp;
            } else if (c >= '0' && c <= '9') {
                multils = multils * 10 + (c - '0');
            } else {
                res += c + "";
            }
        }

        return res;
    }
}
