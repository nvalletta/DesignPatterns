/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory.factories;

import designpatterns.creational.abstractfactory.models.Armor;
import designpatterns.creational.abstractfactory.models.Weapon;

/**
 *
 * @author nora-valletta
 */
public interface AbstractEquipmentFactory {
    public Weapon buildWeapon();
    public Armor buildArmor();
}
