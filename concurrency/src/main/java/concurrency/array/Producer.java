package concurrency.array;

import java.util.concurrent.BlockingQueue;

/**
 * Created by bibek on 8/23/17.
 */
public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Trying to add to queue: String " + i + " and the result was " + queue.offer("String " + i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
