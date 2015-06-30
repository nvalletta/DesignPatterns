/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.memento;

import designpatterns.PatternDemonstration;

/**
 *
 * @author nora-valletta
 */
public class MementoPattern implements PatternDemonstration {

    private IceCreamLover iceCreamLover;
    
    private IceCreamOrder one;
    private IceCreamOrder two;
    private IceCreamOrder three;
    
    private void printOrder() {
        System.out.println(iceCreamLover.getName() + " is ordering a...");
        iceCreamLover.printIceCreamOrder();
    }
    
    @Override
    public void demonstrate() {
        initialize();
        iceCreamLover.setIceCreamOrder(one);
        this.printOrder();
        System.out.println("------ Saving the above order... ------\n");
        iceCreamLover.saveOrderToMemento();
        iceCreamLover.setIceCreamOrder(two);
        this.printOrder();
        iceCreamLover.setIceCreamOrder(three);
        this.printOrder();
        System.out.println(iceCreamLover.getName() + " wants her usual favorite. Restoring state...");
        iceCreamLover.restoreOrderFromMemento();
        this.printOrder();
    }

    @Override
    public void initialize() {
        iceCreamLover = new IceCreamLover("Nora");
        
        one = new IceCreamOrder();
        one.setFlavor("Coconut");
        one.setIsInACone(true);
        one.setScoops(1);
        one.setToppings("Mochi");
        
        two = new IceCreamOrder();
        two.setFlavor("Cotton Candy");
        two.setIsInACone(false);
        two.setScoops(2);
        two.setToppings("Sprinkles");
        
        three = new IceCreamOrder();
        three.setFlavor("Bubblegum");
        three.setIsInACone(true);
        three.setScoops(3);
        three.setToppings("Sprinkles and mochi");
    }
}
