/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.models;

import designpatterns.creational.abstractfactory.enums.ArmorMaterial;

/**
 *
 * @author nora-valletta
 */
public final class Armor extends Equipment {
    private final ArmorMaterial material;
    
    public Armor(ArmorMaterial material, Gem gem, Enchant enchant) {
        this.material = material;
        this.gem = gem;
        this.enchant = enchant;
    }
    
    public ArmorMaterial getMaterial() {
        return this.material;
    }
    
}
