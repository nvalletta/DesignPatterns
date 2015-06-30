/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.memento;

import java.lang.reflect.Field;

/**
 *
 * @author nora-valletta
 */
public final class IceCreamOrder {
    
    private String flavor;
    private String toppings;
    private int scoops;
    private boolean isInACone;
    
    public IceCreamOrder() {
        // Defaults...
        this.flavor = "Vanilla";
        this.toppings = "";
        this.scoops = 2;
        this.isInACone = false;
    }
    
    public IceCreamOrder(IceCreamOrder iceCreamOrder) {
        this.flavor = iceCreamOrder.flavor;
        this.toppings = iceCreamOrder.toppings;
        this.scoops = iceCreamOrder.scoops;
        this.isInACone = iceCreamOrder.isInACone;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public boolean isIsInACone() {
        return isInACone;
    }

    public void setIsInACone(boolean isInACone) {
        this.isInACone = isInACone;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        
        result.append(this.getClass().getName());
        result.append(" {");
        result.append(newLine);
        
        Field[] fields = this.getClass().getDeclaredFields();
        
        for (Field field : fields) {
            result.append("  ");
            try {
                result.append(field.getName());
                result.append(": ");
                result.append(field.get(this));
            } catch (IllegalAccessException e) {
                System.out.println(e);
            }
            result.append(newLine);
        }
        result.append("}");
        result.append(newLine);
        
        return result.toString();
    }
    
    
}
