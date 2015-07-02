/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.models;

import designpatterns.creational.abstractfactory.enums.WeaponShape;


/**
 *
 * @author nora-valletta
 */
public final class Weapon extends Equipment {
    private final WeaponShape shape;
    
    public Weapon(WeaponShape shape, Gem gem, Enchant enchant) {
        this.shape = shape;
        this.gem = gem;
        this.enchant = enchant;
    }
    
    public WeaponShape getShape() {
        return this.shape;
    }
}
