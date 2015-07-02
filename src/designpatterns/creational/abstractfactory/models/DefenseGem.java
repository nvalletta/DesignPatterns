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
public final class DefenseGem extends Gem {
    @Override
    public String getGemDescription() {
        return "A defensive gem, useful for protecting against damage.";
    }
}
