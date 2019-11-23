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
public class Patient {
private String Letter = "P";
private String Name;
private String Surname;
private Integer Age;
private String Gender;
private String StreetNumber;
private String StreetName;
private String CityName;             
private String PostCode;

    public Patient(String Name, String Surname, Integer Age, String Gender, String StreetNumber, String StreetName, String CityName, String PostCode) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Gender = Gender;
        this.StreetNumber = StreetNumber;
        this.StreetName = StreetName;
        this.CityName = CityName;
        this.PostCode = PostCode;
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

    public Integer getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getCityName() {
        return CityName;
    }

    public String getPostCode() {
        return PostCode;
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

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setStreetNumber(String StreetNumber) {
        this.StreetNumber = StreetNumber;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }


}
