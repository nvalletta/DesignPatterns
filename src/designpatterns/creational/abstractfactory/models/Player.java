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
public final class Player {
    
    private final Weapon weapon;
    private final Armor armor;
    
    public Player(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }
    
    public void printWeaponDetails() {
        System.out.println("I weild a weapon with...\n"
                + weapon.getGem().getGemDescription()
                + "\n"
                + weapon.getEnchant().getEnchantDescription());
    }
    
    public void printArmorDetails() {
        System.out.println("My armor has...\n"
                + armor.getGem().getGemDescription()
                + "\n"
                + armor.getEnchant().getEnchantDescription());
    }
    
}
