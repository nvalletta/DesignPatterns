package designpatterns.concurrency.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;


public class ThemePark {
    
    private ArrayBlockingQueue taskQueue = null;
    private final List<ThemeParkRide> rides = new ArrayList<>();
    private boolean isClosed = false;
    
    public ThemePark(int numberOfRides, int maxNumberOfOpenRides) {
        taskQueue = new ArrayBlockingQueue(maxNumberOfOpenRides);
        for (int i=0; i<numberOfRides; i++) {
            rides.add(new ThemeParkRide(taskQueue));
        }
    }
    
    public synchronized void openPark() {
        this.isClosed = false;
        rides.stream().forEach(Thread::start);
    }
    
    public synchronized void closePark() {
        this.stop();
    }
    
    private synchronized void stop() {
        this.isClosed = true;
        rides.stream().forEach(ThemeParkRide::doStop);
    }
    
}
