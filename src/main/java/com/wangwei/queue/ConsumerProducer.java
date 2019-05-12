package com.wangwei.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConsumerProducer {
    private static final String EXIT_MSG = "good bye!";

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();

    }

    static class Producer implements Runnable {
        private BlockingQueue<String> blockingQueue;

        public Producer(BlockingQueue<String> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {

            for (int i = 0; i < 20; i++) {

                try {
                    Thread.sleep(5l);
                    String msg = "Message" + i;
                    System.out.println("Producer new item: " + msg);
                    blockingQueue.put(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                System.out.println("Time to say good bye!");
                blockingQueue.put(EXIT_MSG);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    static class Consumer implements Runnable {

        private BlockingQueue<String> blockingQueue;

        public Consumer(BlockingQueue<String> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {

            try {
                String msg;
                while (!EXIT_MSG.equalsIgnoreCase((msg = blockingQueue.take()))) {
                    System.out.println("Consumer item: " + msg);
                    Thread.sleep(10l);

                }
                System.out.println("Got exit message, bye!");

            } catch (InterruptedException e) {

            }
        }
    }
}
