package designpatterns.concurrency.threadpool;


public class ParkGuest implements Runnable {

    private String rideName = "";
    
    @Override
    public void run() {
        System.out.println(this.toString() + " is having fun on a ride called " + rideName);
    }
    
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }
    
}
