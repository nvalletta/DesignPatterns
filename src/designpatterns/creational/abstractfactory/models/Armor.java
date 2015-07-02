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
public abstract class Armor {
    private ArmorMaterial material;
    private Gem gem;
    private Enchant enchant;
}
