/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.builder;

import java.util.Date;

/**
 *
 * @author nora-valletta
 */
public class GroomingAppointmentBuilder {
    Date appointmentDate;
    String customerName;
    String customerPhoneNumber = "";
    String dogName = "";
    String dogBreed = "";
    boolean nailCleaning = false;
    boolean earCleaning = false;
    boolean brushOut = false;
    boolean hairCut = false;
    
    // An appointment date and customer name is required.
    public GroomingAppointmentBuilder(Date appointmentDate, String customerName) {
        this.appointmentDate = appointmentDate;
        this.customerName = customerName;
    }
    
}
