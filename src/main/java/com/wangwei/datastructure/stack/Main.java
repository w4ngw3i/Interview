package com.wangwei.datastructure.stack;

import com.wangwei.datastructure.queue.ArrayQueue;
import com.wangwei.datastructure.queue.LoopQueue;
import com.wangwei.datastructure.queue.Queue;

import java.util.Random;

/**
 * @Auther wangwei
 * @Date 2018/5/2 下午3:25
 */
public class Main {

    public static void main(String[] args) {
        int opCount = 10000000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testQueue(arrayStack, opCount);
        System.out.println("ArrayStack, time:"+time1+" s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testQueue(linkedListStack, opCount);
        System.out.println("LinkedListStack, time:"+time2+" s");
    }


    private static double testQueue(Stack<Integer> stack, int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;


    }
}
