/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.concurrency.guardedsuspension;

import designpatterns.PatternDemonstration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nora-valletta
 */
public class GuardedSuspension implements PatternDemonstration {

    private FishTank fishTank;
    
    @Override
    public void demonstrate() {
        initialize();
        fishTank.commenceFeedingTime();
    }

    @Override
    public void initialize() {
        try {
            fishTank = new FishTank(10000);
        } catch (Exception ex) {
            Logger.getLogger(GuardedSuspension.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
