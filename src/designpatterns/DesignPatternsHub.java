/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import designpatterns.observer.ObserverPattern;
import designpatterns.memento.MementoPattern;

/**
 *
 * @author nora-valletta
 */
public class DesignPatternsHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MementoPattern m = new MementoPattern();
        m.demonstrate();
    }
    
}
