/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.concurrency.guardedsuspension;

/**
 *
 * @author nora-valletta
 */
public final class GoldFish implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            System.out.println("Fish " + this.toString() + " eats a morsel.");
            FishTank.foodMorsels.remove(FishTank.foodMorsels.size()-1);
        }
    }
    
}
