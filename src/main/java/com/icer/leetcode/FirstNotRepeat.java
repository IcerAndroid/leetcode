package com.icer.leetcode;

import java.util.Arrays;

public class FirstNotRepeat {
    static char firstNotRepeat(char p[], int len) {
        if (len == 1)
            return p[0];

        //把char[] 装进256ascci桶中 ，然后遍历p[] 查找仅有一个元素的桶
        int[] temp = new int[256];
        Arrays.fill(temp, 0);
        char r = p[0];
        for (int i = 0; i < p.length; i++) {
            temp[p[i]] += 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) {
                r = (char) i;
                break;
            }
        }
        return r;
    }
}
