package designpatterns.concurrency.threadpool;


public class ParkGuest implements Runnable {

    @Override
    public void run() {
        System.out.println(this.toString() + " is having fun!");
    }
    
}
