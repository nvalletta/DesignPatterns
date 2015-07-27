package designpatterns.concurrency.threadpool;

import java.util.concurrent.BlockingQueue;


public class ThemeParkRide extends Thread {
    
    private final BlockingQueue queue;
    private boolean isStopped = false;
    
    public ThemeParkRide(BlockingQueue queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        while (!isStopped()) {
            while (queue.isEmpty()) {
                synchronized(queue) {
                    try {
                        queue.wait();
                    } catch (InterruptedException ignored) { }
                }
            }
            
            try {
                Runnable guest = (Runnable)queue.take();
                ((ParkGuest)guest).setRideName(ThemeParkRide.this.toString());
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
