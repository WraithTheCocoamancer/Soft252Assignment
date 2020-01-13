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
public class Doctor extends PersonSuperClass{
public ArrayList<String> DoctorMessages = new ArrayList<>();


    public void Messages()
    {
        
    }
    //ArrayList Messages
    public Doctor(String Letter,String Name, String Surname, String Address, int UserID, String PreferredPassword ) {
        super(Letter, Name, Surname, Address, UserID, PreferredPassword);
    }
    public ArrayList<String> getDoctorMessages() {
        return DoctorMessages;
    }

    public void setDoctorMessages(ArrayList<String> DoctorMessages) {
        this.DoctorMessages = DoctorMessages;
    }
   

}
