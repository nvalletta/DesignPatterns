/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import java.util.Observable;
import java.util.logging.Handler;

/**
 *
 * @author nora-valletta
 */
public class Cat extends Observable {
    
    private String name = "Cat";
    //private Handler catHandler = new Handler();
    private final Runnable iDoWhatIWantRunnable = new Runnable() {
        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    
    
    public Cat() { }
    
    public Cat(String name) {
        this.name = name;
    }
    
    public void startFilmingCat() {
        
    }
    
    private void doSomethingFunny() {
        System.out.println(name + " does a flip!");
        this.notifyObservers();
    }
    
    
}
