package com.icer.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return results;
        }
        Arrays.sort(candidates);
        List<Integer> combinations = new ArrayList<>();
        findCombinationToTarget(results, combinations, candidates, target, 0);
        return results;
    }

    private void findCombinationToTarget(List<List<Integer>> results, List<Integer> combinations, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            results.add(new ArrayList<>(combinations));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            combinations.add(candidates[i]);
            findCombinationToTarget(results, combinations, candidates, target - candidates[i], i);
            combinations.remove(combinations.size() - 1);
        }
    }
}
