/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.factories;

import designpatterns.creational.abstractfactory.enums.ArmorMaterial;
import designpatterns.creational.abstractfactory.enums.WeaponShape;
import designpatterns.creational.abstractfactory.models.Armor;
import designpatterns.creational.abstractfactory.models.DefenseEnchant;
import designpatterns.creational.abstractfactory.models.DefenseGem;
import designpatterns.creational.abstractfactory.models.Enchant;
import designpatterns.creational.abstractfactory.models.Gem;
import designpatterns.creational.abstractfactory.models.Weapon;

/**
 *
 * @author nora-valletta
 */
public final class MageEquipmentFactory implements AbstractEquipmentFactory {

    @Override
    public Weapon buildWeapon() {
        Gem degenseGem = new DefenseGem();
        Enchant defenseEnchant = new DefenseEnchant();
        Weapon staff = new Weapon(WeaponShape.STAFF, degenseGem, defenseEnchant);
        return staff;
    }

    @Override
    public Armor buildArmor() {
        Gem defenseGem = new DefenseGem();
        Enchant defenseEnchant = new DefenseEnchant();
        Armor clothArmor = new Armor(ArmorMaterial.CLOTH, defenseGem, defenseEnchant);
        return clothArmor;
    }
    
}
