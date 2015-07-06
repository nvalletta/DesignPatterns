package designpatterns.creational.abstractfactory;

import designpatterns.PatternDemonstration;
import designpatterns.creational.abstractfactory.enums.HeroClass;
import designpatterns.creational.abstractfactory.factories.PlayerFactory;
import designpatterns.creational.abstractfactory.models.Player;

public class AbstractFactoryPattern implements PatternDemonstration {

    private Player mage;
    private Player warrior;
    
    @Override
    public void demonstrate() {
        initialize();
        System.out.println("\nI'm a mage, and...");
        mage.printArmorDetails();
        mage.printWeaponDetails();
        
        System.out.println("\nI'm a warrior, and...");
        warrior.printArmorDetails();
        warrior.printWeaponDetails();
    }

    @Override
    public void initialize() {
        PlayerFactory mageFactory = new PlayerFactory(HeroClass.MAGE);
        PlayerFactory warriorFactory = new PlayerFactory(HeroClass.WARRIOR);
        
        mage = mageFactory.buildPlayer();
        warrior = warriorFactory.buildPlayer();
    }
    
}