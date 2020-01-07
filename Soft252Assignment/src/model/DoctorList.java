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

public class DoctorList {
    private String DoctorLetter = "D";
    
    public void doctorlist(){
    Doctor Doctor1 = new Doctor (DoctorLetter, "Chad", "Doktor", "The Cauldron Clinic, Bet Lane, PortSide,Brockton bay, BR3 6WB", 2, "Bro");
    Doctor Doctor2 = new Doctor (DoctorLetter, "John", "Manhattan", "The Cauldron Clinic, Bet Lane, PortSide,Brockton bay, BR3 6WB", 3, "WhoWatches");
    Doctor Doctor3 = new Doctor (DoctorLetter, "Steve", "Irwin", "The Cauldron Clinic, Bet Lane, PortSide,Brockton bay, BR3 6WB", 4, "Crikey!");


}
}
