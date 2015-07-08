/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.builder;

import java.lang.reflect.Field;
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
    private boolean nailClipping;
    private boolean earCleaning;
    private boolean brushOut;
    private boolean hairCut;
    
    public GroomingAppointment(GroomingAppointmentBuilder builder) {
        this.appointmentDate = builder.appointmentDate;
        this.customerName = builder.customerName;
        this.customerPhoneNumber = builder.customerPhoneNumber;
        this.dogName = builder.dogName;
        this.dogBreed = builder.dogBreed;
        this.nailClipping = builder.nailClipping;
        this.earCleaning = builder.earCleaning;
        this.brushOut = builder.brushOut;
        this.hairCut = builder.hairCut;
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

    public void setCustomerName(String customerName) throws Exception {
        if (null == customerName || customerName.isEmpty()) {
            throw new Exception("Invalid customer name.");
        }
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
        return nailClipping;
    }

    public void setNailCleaning(boolean nailCleaning) {
        this.nailClipping = nailCleaning;
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Field[] fields = GroomingAppointment.class.getDeclaredFields();
        try {
            for (Field f : fields) {
                sb.append(f.getName()).append(": ").append(f.get(GroomingAppointment.class)).append("\n");
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        
        return sb.toString();
    }
    
    //Out GoromingAppointmentBuilder eliminates the need
    //to have many constructors. It also ensures that we
    //always recieve a VALID version of the object we're
    //building; using setters, you're stuck with an
    //invalid GroomingAppointment object until you've
    //set all of its fields.
    public static class GroomingAppointmentBuilder {
        
        Date appointmentDate;
        String customerName;
        
        String customerPhoneNumber = "";
        String dogName = "";
        String dogBreed = "";
        boolean nailClipping = false;
        boolean earCleaning = false;
        boolean brushOut = false;
        boolean hairCut = false;

        // An appointment date and customer name is required.
        public GroomingAppointmentBuilder(Date appointmentDate, String customerName) {
            this.appointmentDate = appointmentDate;
            this.customerName = customerName;
        }
        
        public GroomingAppointmentBuilder customerPhoneNumber(String phoneNumber) {
            this.customerPhoneNumber = phoneNumber;
            return this;
        }
        
        public GroomingAppointmentBuilder dogName(String dogName) {
            this.dogName = dogName;
            return this;
        }
        
        public GroomingAppointmentBuilder dogBreed(String dogBreed) {
            this.dogBreed = dogBreed;
            return this;
        }
        
        public GroomingAppointmentBuilder nailClipping(boolean nailClipping) {
            this.nailClipping = nailClipping;
            return this;
        }
        
        public GroomingAppointmentBuilder earCleaning(boolean earCleaning) {
            this.earCleaning = earCleaning;
            return this;
        }
        
        public GroomingAppointmentBuilder brushOut(boolean brushOut) {
            this.brushOut = brushOut;
            return this;
        }
        
        public GroomingAppointmentBuilder hairCut(boolean hairCut) {
            this.hairCut = hairCut;
            return this;
        }
        
        public GroomingAppointment createAppointment() {
            return new GroomingAppointment(this);
        }
    }
    
}
