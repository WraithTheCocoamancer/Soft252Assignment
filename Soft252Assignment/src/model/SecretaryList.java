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
public class SecretaryList {
    private String SecretaryLetter = "S";
    Secretary Secretary1 = new Secretary (SecretaryLetter, "Gina", "Linetti", "The Cauldron Clinic, Bet Lane, PortSide,Brockton bay, BR3 6WB", 2,"YasQueen");
    public ArrayList<Secretary> SecretaryList = new ArrayList<>();
    public void doctorlist()
    {
        SecretaryList.add(Secretary1);
    
    }
}
