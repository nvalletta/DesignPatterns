package designpatterns.concurrency.guardedsuspension;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nora-valletta
 */
public class Player implements Runnable {
    
    public synchronized void throwBalls() {
        while (!Coach.game.gameOn) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(this.toString() + " throws a ball!");
    }

    @Override
    public void run() {
        while (true) {
            throwBalls();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
