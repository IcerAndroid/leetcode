package com.icer.leetcode;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = getIndex(arr, low, high);
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];//找出基准值
        while (low < high) {
            while (low < high && arr[high] >= temp) {
                //队尾的元素大于基准值，将high指针往左移
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            while (low < high && arr[low] <= temp) {
                //队头的元素小于基准值，将low指针往右移
                low++;
            }
            // 如果队头元素大于于tmp了,需要将其赋值给high
            arr[high] = arr[low];
        }
        //跳出循环后，low和high相等，此时的low或high就是tmp的正确索引位置
        arr[low] = temp;
        return low;
    }
}
