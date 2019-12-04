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
private String Letter = "A";
private String Name;
private String Surname;
private String Address;


    public PersonSuperClass(String Name, String Surname, String StreetNumber, String StreetName, String CityName, String PostCode) {
        this.Name = Name;
        this.Surname = Surname;

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
    public void setLetter(String Letter) {
        this.Letter = Letter;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
}
