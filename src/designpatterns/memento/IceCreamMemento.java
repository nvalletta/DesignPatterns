/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.memento;

/**
 * 
 * @author nora-valletta
 */
public final class IceCreamMemento {
    
    private IceCreamOrder iceCreamOrder;
    
    public void setState(IceCreamOrder order) {
        // Make a copy of the original object...
        iceCreamOrder = new IceCreamOrder(order);
    }
    
    public IceCreamOrder getState() {
        return this.iceCreamOrder;
    }
    
}
