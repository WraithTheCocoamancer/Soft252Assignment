/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mhill9
 */
public class Appointments {
    public String DoctorId;
    public String PaitentId;
    public String PossibleDates;

    public Appointments(String DoctorId, String PaitentId, String PossibleDates) {
        this.DoctorId = DoctorId;
        this.PaitentId = PaitentId;
        this.PossibleDates = PossibleDates;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getPaitentId() {
        return PaitentId;
    }

    public void setPaitentId(String PaitentId) {
        this.PaitentId = PaitentId;
    }

    public String getPossibleDates() {
        return PossibleDates;
    }

    public void setPossibleDates(String PossibleDates) {
        this.PossibleDates = PossibleDates;
    }
    
    
}
