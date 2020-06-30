package cn.itcast.n8;

import sun.management.counter.perf.PerfInstrumentation;

import java.security.PublicKey;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolTest {
}


class BlockQueue<T> {

    private Deque<T> task = new ArrayDeque();

    private ReentrantLock lock = new ReentrantLock();

    private Condition fullWaitSet = lock.newCondition();

    private Condition emptyWaitSet = lock.newCondition();
    private Integer capacity;

    public BlockQueue(int capacity){
        this.capacity=capacity;
    }

    Thread

}