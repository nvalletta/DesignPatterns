/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.factories;

import designpatterns.creational.abstractfactory.enums.ArmorMaterial;
import designpatterns.creational.abstractfactory.enums.WeaponShape;
import designpatterns.creational.abstractfactory.models.Armor;
import designpatterns.creational.abstractfactory.models.Enchant;
import designpatterns.creational.abstractfactory.models.Gem;
import designpatterns.creational.abstractfactory.models.PowerEnchant;
import designpatterns.creational.abstractfactory.models.PowerGem;
import designpatterns.creational.abstractfactory.models.Weapon;

/**
 *
 * @author nora-valletta
 */
public final class WarriorEquipmentFactory implements AbstractEquipmentFactory {

    @Override
    public Weapon buildWeapon() {
        Gem powerGem = new PowerGem();
        Enchant powerEnchant = new PowerEnchant();
        Weapon sword = new Weapon(WeaponShape.SWORD, powerGem, powerEnchant);
        return sword;
    }

    @Override
    public Armor buildArmor() {
        Gem powerGem = new PowerGem();
        Enchant powerEnchant = new PowerEnchant();
        Armor plateArmor = new Armor(ArmorMaterial.PLATE, powerGem, powerEnchant);
        return plateArmor;
    }
    
}
