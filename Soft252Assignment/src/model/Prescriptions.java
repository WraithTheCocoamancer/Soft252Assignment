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
public class Prescriptions {
    public String DoctorId;
    public String paitentId;
    public String DoctorsNotes;
    public String Medicine;
    public int Quantity;
    public String Doseage;

    public Prescriptions(String DoctorId, String paitentId, String DoctorsNotes, String Medicine, int Quantity, String Doseage) {
        this.DoctorId = DoctorId;
        this.paitentId = paitentId;
        this.DoctorsNotes = DoctorsNotes;
        this.Medicine = Medicine;
        this.Quantity = Quantity;
        this.Doseage = Doseage;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getPaitentId() {
        return paitentId;
    }

    public void setPaitentId(String paitentId) {
        this.paitentId = paitentId;
    }

    public String getDoctorsNotes() {
        return DoctorsNotes;
    }

    public void setDoctorsNotes(String DoctorsNotes) {
        this.DoctorsNotes = DoctorsNotes;
    }

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDoseage() {
        return Doseage;
    }

    public void setDoseage(String Doseage) {
        this.Doseage = Doseage;
    }
    
    
}
