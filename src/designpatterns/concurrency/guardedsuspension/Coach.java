
package designpatterns.concurrency.guardedsuspension;

import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author nora-valletta
 */
public class Coach {
    
    public static final String PLAY_BALL = "If you can dodge a wrench, you can dodge a ball. PLAY BALL!";
    private final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
    public static final DodgeballGame game = new DodgeballGame();
    
    
    public void beACoach() {
        executor.scheduleAtFixedRate(() -> coachTheGame(), 0, 10, TimeUnit.SECONDS);
    }
    
    private void coachTheGame() {
        synchronized(game) {
            System.out.println("Stop playing!");
            game.gameOn = false;

            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

            System.out.println(PLAY_BALL);
            game.gameOn = true;
            game.notifyAll();
        }
    }
    
}
