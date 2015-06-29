/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import designpatterns.PatternDemonstration;

/**
 *
 * @author nora-valletta
 */
public class ObserverPattern implements PatternDemonstration {
    
    private Human human;
    private Cat cat;
    
    @Override
    public void demonstrate() {
        this.initialize();
        human.watch(cat);
        cat.beACat();
    }
    
    @Override
    public void initialize() {
        human = new Human("Nora");
        cat = new Cat("Kiki");
    }
    
}
