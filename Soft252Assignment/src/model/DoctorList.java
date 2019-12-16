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

public class DoctorList {
    private String DoctorLetter = "D";
    
    public void doctorlist(){
    Doctor Doctor1 = new Doctor (DoctorLetter, "Chad", "Doktor", "1234 Medical Lane", 2);
    Doctor Doctor2 = new Doctor (DoctorLetter, "John", "Manhattan", "22 Downhall Road", 3);
    Doctor Doctor3 = new Doctor (DoctorLetter, "Steve", "Irwin", "42 Wallaby Way", 4);


}
}
