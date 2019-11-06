package com.icer.leetcode;

public class MaxGap {
    /**
     * 1、找到数组中max、min
     * 2、创建n+1个桶
     */
    public int maxGap(int[] arr) {
        int len = arr.length;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        boolean[] hasNums = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];



        return 0;
    }

    public int bucket(long num,long len,long min,long max){

        return 0;
    }
}
