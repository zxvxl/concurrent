package cn.itcast.n8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkTaskTest {
    public static void main(String[] args){
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    System.out.print(forkJoinPool.invoke(new task(10)));
    }
}

class task extends RecursiveTask {
    int n;

    public task(int n){
        this.n=n;
    }
    @Override
    public Integer compute() {
        if (n == 1) {
            // 如果 n 已经为 1，可以求得结果了 if (n == 1) {
            return n;
        }
        // 将任务进行拆分(fork)
        AddTask1 t1 = new AddTask1(n - 1);
        t1.fork();
        // 合并(join)结果
        int result = n + t1.join();
        return result;
    }
}