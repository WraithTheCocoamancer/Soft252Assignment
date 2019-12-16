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
public class Patient extends PersonSuperClass{
private Integer Age;
private String Gender;

    public Patient(String Letter,String Name, String Surname, String Address, int UserID) {
        super(Letter, Name, Surname, Address, UserID);
    }

   
    public Integer getAge() {
        return Age;
    }
    public String getGender() {
        return Gender;
    }
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
}
