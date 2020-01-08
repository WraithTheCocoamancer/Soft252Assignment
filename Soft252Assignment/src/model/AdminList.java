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
public class AdminList {
    private String AdminLetter = "A";
    Administrator Admin1 = new Administrator (AdminLetter, "Reeanu", "Keeves", "The Cauldron Clinic, Bet Lane, PortSide,Brockton bay, BR3 6WB", 1, "mydog");   
   public ArrayList<Administrator> AdminList = new ArrayList<>(); 
    
    public AdminList()
    {
      AdminList.add(Admin1);
    //this is a test for save delete this when you find it
    }
}
