/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import java.util.Observable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nora-valletta
 */
public class Cat extends Observable {
    
    private String name = "Cat";
    final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
    
    public Cat() { }
    
    public Cat(String name) {
        this.name = name;
    }
    
    public void beACat() {
        executor.schedule(() -> doSomethingFunny(), (int)(Math.random() * 10), TimeUnit.SECONDS);
    }
    
    private void doSomethingFunny() {
        System.out.println(name + " flips out!");
        this.setChanged();
        this.notifyObservers();
    }
    
}
