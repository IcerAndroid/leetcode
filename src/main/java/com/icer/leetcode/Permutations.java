package com.icer.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations  排列组合
 * Given a collection of distinct integers, return all possible permutations.
 * Input: [1,2,3]
 * Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        helper(results, new ArrayList<>(), nums);
        return results;
    }

    private void helper(List<List<Integer>> results, List<Integer> combination,
                        int[] nums) {
        if (combination.size() == nums.length) {
            results.add(new ArrayList<>(combination));
        }
        for (int i = 0; i < nums.length; i++) {
            if (combination.contains(nums[i])) continue;
            combination.add(nums[i]);
            helper(results, combination, nums);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5};
        Permutations app = new Permutations();
        List<List<Integer>> results = app.permute(arr);
        System.out.println(results);
    }
}
