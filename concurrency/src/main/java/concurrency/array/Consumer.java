package concurrency.array;

import java.util.concurrent.BlockingQueue;

/**
 * Created by bibek on 8/23/17.
 */
public class Consumer implements Runnable{
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(queue.remainingCapacity()>0){
            System.out.println("Queue size: " + queue.size() +
                    ", remaining capacity: " + queue.remainingCapacity());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
