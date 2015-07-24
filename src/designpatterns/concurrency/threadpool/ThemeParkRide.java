package designpatterns.concurrency.threadpool;

import java.util.concurrent.BlockingQueue;


public class ThemeParkRide extends Thread {
    
    private BlockingQueue queue = null;
    private boolean isStopped = false;
    
    public ThemeParkRide(BlockingQueue queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        while (!isStopped()) {
            try {
                Runnable guest = (Runnable)queue.take();
                guest.run();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public synchronized void doStop() {
        this.isStopped = true;
        this.interrupt();
    }
    
    private synchronized boolean isStopped() {
        return this.isStopped;
    }
    
}
