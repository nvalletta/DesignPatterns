/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.concurrency.guardedsuspension;

import java.util.ListIterator;

/**
 *
 * @author nora-valletta
 */
public class Feeder implements Runnable {

    @Override
    public void run() {
        ListIterator it = FishTank.foodMorsels.listIterator();
        
        for (int i=0; i<10000; i++) {
            System.out.println("The feeder adds morsels to the tank.");
            FoodMorsel m = new FoodMorsel();
            FishTank.foodMorsels.add(m);
        }
        
        while (it.hasNext()) {
            FoodMorsel f = (FoodMorsel)it.next();
        }
    }
    
}
