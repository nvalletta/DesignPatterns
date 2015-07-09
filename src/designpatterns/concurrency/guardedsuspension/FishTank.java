/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.concurrency.guardedsuspension;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nora-valletta
 */
public final class FishTank {
    
    private Feeder goldFishFeeder = new Feeder();
    private GoldFish goldFish = new GoldFish();
    public static List<FoodMorsel> foodMorsels = new ArrayList<>();
    
    public FishTank(int numberOfFoodMorsels) throws Exception {
        if (numberOfFoodMorsels <= 0) {
            throw new Exception("Must have a positive number of morsels of food.");
        }
        
        for (int i=0; i< numberOfFoodMorsels; i++) {
            addFoodMorsel();
        }
    }
    
    public void commenceFeedingTime() {
        (new Thread(goldFishFeeder)).start();
        (new Thread(goldFish)).start();
    }
    
    private void addFoodMorsel() {
        FoodMorsel morsel = new FoodMorsel();
        foodMorsels.add(morsel);
    }
    
}
