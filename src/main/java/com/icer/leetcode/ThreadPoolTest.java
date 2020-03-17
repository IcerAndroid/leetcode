package com.icer.leetcode;

import java.util.concurrent.*;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(0,
               5,
                60,
                TimeUnit.MILLISECONDS, new SynchronousQueue<>());
        for (int i = 0; i < 15; i++) {
            Task task = new Task(i);
            pool.execute(task);
            System.out.println("线程池中线程数目："+pool.getPoolSize()+"，队列中等待执行的任务数目："+
                    pool.getQueue().size()+"，已执行玩别的任务数目："+pool.getCompletedTaskCount());
        }
        pool.shutdown();
    }

    public static class Task implements Runnable {
        private int num;

        public Task(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行任务  " + num);
            try {
                Thread.currentThread().sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程" + num + "执行完毕");
        }
    }
}
