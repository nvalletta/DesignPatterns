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
public final class GroomingAppointment {
    
    /*
    Below: We have so many options when scheduling an appointment!
    Instead of having numerous constructors, we'll use the Builder pattern.
    */
    
    private Date appointmentDate;
    
    private String customerName;
    private String customerPhoneNumber;
    
    private String dogName;
    private String dogBreed;
    
    private boolean nailCleaning = false;
    private boolean earCleaning = false;
    private boolean brushOut = false;
    private boolean hairCut = false;
    
    public GroomingAppointment(Date appointmentDate, String customerName) {
        this.appointmentDate = appointmentDate;
        this.customerName = customerName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) throws Exception {
        Date now = new Date();
        if (null == appointmentDate || appointmentDate.getTime() < now.getTime()) {
            throw new Exception("Invalid appointment date.");
        }
        this.appointmentDate = appointmentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean isNailCleaning() {
        return nailCleaning;
    }

    public void setNailCleaning(boolean nailCleaning) {
        this.nailCleaning = nailCleaning;
    }

    public boolean isEarCleaning() {
        return earCleaning;
    }

    public void setEarCleaning(boolean earCleaning) {
        this.earCleaning = earCleaning;
    }

    public boolean isBrushOut() {
        return brushOut;
    }

    public void setBrushOut(boolean brushOut) {
        this.brushOut = brushOut;
    }

    public boolean isHairCut() {
        return hairCut;
    }

    public void setHairCut(boolean hairCut) {
        this.hairCut = hairCut;
    }
    
}
