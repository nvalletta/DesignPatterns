/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.models;

/**
 *
 * @author nora-valletta
 */
public abstract class Equipment {
    protected Gem gem;
    protected Enchant enchant;
    
    public Gem getGem() {
        return this.gem;
    }
    
    public Enchant getEnchant() {
        return this.enchant;
    }
}
