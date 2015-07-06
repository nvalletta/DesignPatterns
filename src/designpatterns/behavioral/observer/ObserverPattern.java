/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.observer;

import designpatterns.PatternDemonstration;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nora-valletta
 */
public class ObserverPattern implements PatternDemonstration {
    
    private List<Human> humans;
    private Cat cat;
    
    @Override
    public void demonstrate() {
        this.initialize();
        humans.stream().forEach((human) -> {
            human.watch(cat);
        });
        cat.beACat();
    }
    
    @Override
    public void initialize() {
        humans = new ArrayList<>();
        humans.add(new Human("Nora"));
        humans.add(new Human("Brett"));
        humans.add(new SuperHuman("Sterling Archer"));
        cat = new Cat("Kiki");
    }
    
}
