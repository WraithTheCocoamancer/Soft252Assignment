/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mhill9
 */
public class PatientList {
    private String PatientLetter = "P";
    Patient Patient1 = new Patient (PatientLetter, "Jeffery", "Brown", "12 Hollow Point Street", 5,"Brown123",20, "Male");
    Patient Patient2 = new Patient (PatientLetter, "Jane", "Doe", "123 Plain Street", 6,"Snow",19, "Female");
    Patient Patient3 = new Patient (PatientLetter, "Jeramiah", "Quinten", "4 Waterway", 7,"Splendid?",60, "Male");
    public ArrayList<Patient> PatientList = new ArrayList<>();
    public void patientlist()
    {
    PatientList.add(Patient1);
    PatientList.add(Patient2);
    PatientList.add(Patient3);
    }
}
