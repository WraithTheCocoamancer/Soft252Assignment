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
public class PatientList {
    private String PatientLetter = "P";
    
    public void Patientlist(){
    Patient Patient1 = new Patient (PatientLetter, "Jeffery", "Brown", "12 Hollow Point Street", 5);
    Patient Patient2 = new Patient (PatientLetter, "John", "Doe", "123 Plain Street", 6);
    Patient Patient3 = new Patient (PatientLetter, "Jeramiah", "Quinten", "4 Waterway", 7);
}
}
