package com.icer.leetcode;

public class JumpGame {
    //计算每一个item能达到的位置，并保存最大值reach
    //如果reach>=nums.length-1，返回true
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (reach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
