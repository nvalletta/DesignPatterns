/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author nora-valletta
 */
public class Human implements Observer {

    private String name = "Human";
    
    public Human () { }
    
    public Human (String name) {
        this.name = name;
    }
    
    public void watch(Observable thingToWatch) {
        thingToWatch.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " says, \"LOL!\"");
        o.deleteObserver(this);
    }
    
}
