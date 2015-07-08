/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.builder;

import designpatterns.PatternDemonstration;
import java.util.Date;

/**
 *
 * @author nora-valletta
 */
public class BuilderPattern implements PatternDemonstration {

    private GroomingAppointment appointment;
    
    @Override
    public void demonstrate() {
        initialize();
        System.out.println(appointment.toString());
    }

    @Override
    public void initialize() {
        appointment = new GroomingAppointment.GroomingAppointmentBuilder(new Date(), "Hi")
                .dogBreed("Doberman Pinscher")
                .nailClipping(true)
                .brushOut(true)
                .createAppointment();
    }
    
}
