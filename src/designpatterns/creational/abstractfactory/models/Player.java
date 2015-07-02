/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.models;

import designpatterns.creational.abstractfactory.enums.HeroClass;

/**
 *
 * @author nora-valletta
 */
public final class Player {
    
    private HeroClass heroClass;
    private Weapon weapon;
    private Armor armor;
    
    private void generateEquipment() {
        // TODO: Use the abstract factory to generate weapon and armor.
    }
    
    public Player(HeroClass heroClass) {
        this.heroClass = heroClass;
        this.generateEquipment();
    }
    
    public HeroClass getHeroClass() {
        return this.heroClass;
    }
    
    public void printWeaponDetails() {
        // TODO: Print weapon details here.
    }
    
    public void printArmorDetails() {
        // TODO: Print armor details here.
    }
    
}
