/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author nora-valletta
 */
public class SuperHuman extends Human implements Observer {
    
    public String name = "SuperHuman";
    
    public SuperHuman() { }
    
    public SuperHuman(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " says, \"...\"");
        o.deleteObserver(this);
    }
    
}
