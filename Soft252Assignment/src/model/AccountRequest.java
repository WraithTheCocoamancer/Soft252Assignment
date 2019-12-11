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
public class AccountRequest {
    public String PotentialPatientName;
    public String PotentialPatientAddess;

    public AccountRequest(String PotentialPatientName, String PotentialPatientAddess) {
        this.PotentialPatientName = PotentialPatientName;
        this.PotentialPatientAddess = PotentialPatientAddess;
    }

    public String getPotentialPatientName() {
        return PotentialPatientName;
    }

    public void setPotentialPatientName(String PotentialPatientName) {
        this.PotentialPatientName = PotentialPatientName;
    }

    public String getPotentialPatientAddess() {
        return PotentialPatientAddess;
    }

    public void setPotentialPatientAddess(String PotentialPatientAddess) {
        this.PotentialPatientAddess = PotentialPatientAddess;
    }
    
    
}
