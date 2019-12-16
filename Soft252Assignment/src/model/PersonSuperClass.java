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
private String PreferedPassword;


    public PersonSuperClass(String Letter, String Name, String Surname,String Address, int UserID, String PreferedPassword) {
        this.Letter = Letter;
        this.Name = Name;
        this.Surname = Surname;
        this.Address = Address;
        this.UserId = UserId;
        this.PreferedPassword = PreferedPassword;
    }

    public String getLetter() {
        return Letter;
    }

    public void setLetter(String Letter) {
        this.Letter = Letter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPreferedPassword() {
        return PreferedPassword;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setPreferedPassword(String PreferedPassword) {
        this.PreferedPassword = PreferedPassword;
    }

    
}
