/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.concurrency.guardedsuspension;

import designpatterns.PatternDemonstration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nora-valletta
 */
public class GuardedSuspension implements PatternDemonstration {
    
    private List<Player> players;
    private Coach coach;
    
    @Override
    public void demonstrate() {
        initialize();
        players.stream().forEach((p) -> {
            (new Thread(p)).start();
        });
        coach.beACoach();
    }

    @Override
    public void initialize() {
        players = new ArrayList<>();
        for (int i=0; i<10; i++) {
            Player p = new Player();
            players.add(p);
        }
        
        coach = new Coach();
    }
    
}
