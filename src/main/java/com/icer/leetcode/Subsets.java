package com.icer.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * Example:
 * <p>
 * Input: nums = [1,2,3]
 * Output:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Subsets {

    /**
     * 位运算
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets1(int[] nums) {
        int size = nums.length;
        int n = 1 << size;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if (((i >> j) & 1) == 1) {
                    cur.add(nums[j]);
                }
            }
            res.add(cur);
        }
        return res;
    }

    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, ++i);
            tempList.remove(tempList.size() - 1);
        }

    }


    /**
     * 给定一个没有重复数字的序列，返回其所有可能的全排列
     */
    /***************************************排列问题**********************************************************/
    static class Permutaions {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            Permutaions permutaions = new Permutaions();
            List<List<Integer>> subsets = permutaions.subsets(arr);
            System.out.println(subsets);
        }

        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            helper(list, new ArrayList<>(), nums);
            return list;
        }

        //Permutations 排列问题
        private void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
            if (tempList.size() == nums.length) {
                //注意这里一定要用new Arraylist<>()
                list.add(new ArrayList<>(tempList));
            }
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                helper(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }

    }

}
