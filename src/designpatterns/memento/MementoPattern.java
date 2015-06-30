/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.memento;

import designpatterns.PatternDemonstration;

/**
 *
 * @author nora-valletta
 */
public class MementoPattern implements PatternDemonstration {

    private IceCreamLover nora;
    
    private IceCreamOrder one;
    private IceCreamOrder two;
    private IceCreamOrder three;
    
    @Override
    public void demonstrate() {
        initialize();
        nora.setIceCreamOrder(one);
        System.out.println(nora.getName() + " is ordering a...");
        nora.printIceCreamOrder();
        System.out.println("------ Saving the above order... ------\n");
        nora.saveOrderToMemento();
        nora.setIceCreamOrder(two);
        System.out.println(nora.getName() + " is ordering a...");
        nora.printIceCreamOrder();
        nora.setIceCreamOrder(three);
        System.out.println(nora.getName() + " is ordering a...");
        nora.printIceCreamOrder();
        System.out.println(nora.getName() + " wants her usual favorite. Restoring state...");
        nora.restoreOrderFromMemento();
        System.out.println(nora.getName() + " is ordering a...");
        nora.printIceCreamOrder();
    }

    @Override
    public void initialize() {
        nora = new IceCreamLover("Nora");
        
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
