package com.icer.leetcode;

import java.util.Arrays;

public class HeapSort {

    //完全二叉树：除最后一层之外的其他每一层都被完全填充，并且所有节点都保持向左对齐
    //满二叉树:除叶子节点外的每一个节点都有两个孩子，每一层都被完全填充
    //完满二叉树：除了叶子结点之外的每一个结点都有两个孩子
    //step1 建堆
    public static void heapify(int[] arrays, int currentRootNode, int size) {
        if (currentRootNode < arrays.length) {
            int left = currentRootNode * 2 + 1;
            int right = currentRootNode * 2 + 2;
            int max = currentRootNode;
            if (left < size) {
                if (arrays[max] < arrays[left]) {
                    max = left;
                }
            }
            if (right < size) {
                if (arrays[max] < arrays[right]) {
                    max = right;
                }
            }

            if (max != currentRootNode) {
                int temp = arrays[currentRootNode];
                arrays[currentRootNode] = arrays[max];
                arrays[max] = temp;

                //继续比较，直到完成一次建堆
                heapify(arrays, max, size);
            }
        }

    }

    //完成一次建堆，最大值在堆的顶部(根节点)
    public static void maxHeapify(int[] arrays, int size) {
        // 从数组的尾部开始，直到第一个元素(角标为0)
        for (int i = size - 1; i >= 0; i--) {
            heapify(arrays, i, size);
        }
    }

    public static void main(String[] args) {
        int[] arrays = {1,10, 5, 6, 8, 9};
        System.out.println(Arrays.toString(arrays));
        for (int i = 0; i < arrays.length; i++) {
            //每次建堆就可以排除一个元素了
            maxHeapify(arrays, arrays.length - i);

            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;
        }
        System.out.println(Arrays.toString(arrays));
    }
}
