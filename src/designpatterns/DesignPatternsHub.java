
package designpatterns;

import designpatterns.concurrency.guardedsuspension.GuardedSuspension;

/**
 * @author nora-valletta
 */
public class DesignPatternsHub {

    public static void main(String[] args) {
        GuardedSuspension pattern = new GuardedSuspension();
        pattern.demonstrate();
    }
    
}
