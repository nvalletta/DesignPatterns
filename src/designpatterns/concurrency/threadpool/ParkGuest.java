package designpatterns.concurrency.threadpool;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ParkGuest implements Runnable {

    private String rideName = "";
    
    @Override
    public void run() {
        System.out.println(this.toString() + " is having fun on a ride called " + rideName);
        try {
            Thread.sleep((long)(Math.random()*10000));
        } catch (InterruptedException ex) {
            Logger.getLogger(ParkGuest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }
    
}
