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
    
    private List<GoldFish> goldfishies = new ArrayList<>();
    public static List<FoodMorsel> foodMorsels = new ArrayList<>();
    
    public FishTank(int numberOfFish, int numberOfFoodMorsels) throws Exception {
        if (numberOfFish <= 0 || numberOfFoodMorsels <= 0) {
            throw new Exception("Must have a positive number of fish and morsels of food.");
        }
        
        for (int i=0; i < numberOfFish; i++) {
            addGoldFish();
        }
        for (int i=0; i< numberOfFoodMorsels; i++) {
            addFoodMorsel();
        }
    }
    
    public void commenceFeedingTime() {
        //TODO: All the fishies eat all the foods (concurrently)
        goldfishies.stream().forEach((fish) -> {
            (new Thread(fish)).start();
        });
    }
    
    private void addGoldFish() {
        GoldFish fish = new GoldFish();
        goldfishies.add(fish);
    }
    
    private void addFoodMorsel() {
        FoodMorsel morsel = new FoodMorsel();
        foodMorsels.add(morsel);
    }
    
    
    
}
