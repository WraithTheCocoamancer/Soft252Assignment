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
private int Age;
private String Gender;

    public Patient(String Letter,String Name, String Surname, String Address, int UserID, String PreferredPassword, int Age, String Gender) {
        super(Letter, Name, Surname, Address, UserID, PreferredPassword);
    }

   
    public int getAge() {
        return Age;
    }
    public String getGender() {
        return Gender;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
}
