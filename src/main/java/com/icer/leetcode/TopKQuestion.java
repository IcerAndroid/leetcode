package com.icer.leetcode;

import java.util.*;

public class TopKQuestion {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        //init heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return count.get(o1).compareTo(count.get(o2));
            }
        });

        // keep k top frequent elements in the heap
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        //build output list
        List<Integer> top_k = new LinkedList();
        while (!heap.isEmpty()) {
            int value = heap.poll();
            top_k.add(value);
        }
        return top_k;
    }
}
