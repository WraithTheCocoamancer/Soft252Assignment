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
public class PersonSuperClass {
private String Letter;
private String Name;
private String Surname;
private String Address;
private int UserId;


    public PersonSuperClass(String Name, String Surname,String Address, int UserID) {
        
        this.Name = Name;
        this.Surname = Surname;
        this.Address = Address;
        this.UserId = UserId;
    }

    public String getLetter() {
        return Letter;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }
    
    public int GetUserId() {
        return UserId;
    } 
    public void setLetter(String Letter) {
        this.Letter = Letter;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
    
    public void setUserId (int UserId) {
        this.UserId = UserId;
    }
}
