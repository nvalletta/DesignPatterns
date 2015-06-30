/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.memento;

/**
 *
 * @author nora-valletta
 */
public final class IceCreamLover {
    
    private String name = "Lover of the ice creams";
    private IceCreamOrder iceCreamOrder;
    private final IceCreamMemento iceCreamMemento;
    
    public IceCreamLover(String name) {
        this.name = name;
        this.iceCreamOrder = new IceCreamOrder();
        this.iceCreamMemento = new IceCreamMemento();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setIceCreamOrder(IceCreamOrder newOrder) {
        this.iceCreamOrder = newOrder;
    }
    
    public void saveOrderToMemento() {
        this.iceCreamMemento.setState(iceCreamOrder);
    }
    
    public void restoreOrderFromMemento() {
        this.iceCreamOrder = this.iceCreamMemento.getState();
    }
    
    public void printIceCreamOrder() {
        System.out.println(iceCreamOrder.toString());
    }
    
}
