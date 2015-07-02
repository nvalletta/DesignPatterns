/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.factories;

import designpatterns.creational.abstractfactory.enums.HeroClass;
import designpatterns.creational.abstractfactory.models.Armor;
import designpatterns.creational.abstractfactory.models.Player;
import designpatterns.creational.abstractfactory.models.Weapon;

/**
 *
 * @author nora-valletta
 */
public class PlayerFactory {
    
    private final AbstractEquipmentFactory equipmentFactory;
    
    public PlayerFactory(HeroClass heroClass) {
        if (heroClass.equals(HeroClass.MAGE)) {
            equipmentFactory = new MageEquipmentFactory();
        } else {
            equipmentFactory = new WarriorEquipmentFactory();
        }
    }
    
    public Player buildPlayer() {
        Weapon weapon = equipmentFactory.buildWeapon();
        Armor armor = equipmentFactory.buildArmor();
        
        Player player = new Player(weapon, armor);
        return player;
    }
    
}
